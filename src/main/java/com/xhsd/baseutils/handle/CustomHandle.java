package com.xhsd.baseutils.handle;

import com.xhsd.constant.CommonCst;
import com.xhsd.dto.ExceptionResultDto;
import com.xhsd.utils.Result;
import com.xhsd.utils.ReturnCode;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class CustomHandle {

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<ExceptionResultDto> methodArgumentNotValidExceptionHandle(MethodArgumentNotValidException e) {
        ExceptionResultDto dto = new ExceptionResultDto();
        List<ObjectError> allErrors = e.getAllErrors();
        List<String> errorsMessages = allErrors.stream()
                .map(error -> error.getDefaultMessage())
                .collect(Collectors.toList());
        dto.setErrorCode(CommonCst.STR_MINUS_ONE);
        dto.setErrorMsg(errorsMessages.toString());
        return Result.failure(ReturnCode.OPERATION_ERROR,dto);
    }

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public Result<ExceptionResultDto> runtimeExceptionHandle(RuntimeException e) {
        ExceptionResultDto dto = new ExceptionResultDto();
        dto.setErrorCode(CommonCst.STR_MINUS_ONE);
        dto.setErrorMsg(e.getMessage());
        return Result.failure(ReturnCode.OPERATION_ERROR,dto);
    }


}
