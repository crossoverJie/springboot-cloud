package com.crossoverJie.sbcorder.common.config;

import com.crossoverJie.sbcorder.common.enums.StatusEnum;
import com.crossoverJie.sbcorder.common.exception.SBCException;
import com.crossoverJie.sbcorder.common.res.BaseResponse;
import com.crossoverJie.sbcorder.common.res.NULLBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice  
@ResponseBody  
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.OK)
	public Object handleMethodArgumentNotValidException(Exception e) {

		BaseResponse<NULLBody> response = new BaseResponse<NULLBody>();
		response.setCode(StatusEnum.FAIL.getCode());
		if (e instanceof SBCException){
			response.setMessage(e.getMessage());

		} else {
			response.setMessage(StatusEnum.FAIL.getMessage());
		}
		return response ;
	}  

}  