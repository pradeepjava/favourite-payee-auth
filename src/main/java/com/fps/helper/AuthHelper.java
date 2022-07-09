package com.fps.helper;

import com.fps.model.CommonResponse;

public class AuthHelper {

	private static final int NOT_FOUND = 404;
	private static final int OK = 200;
	private static final String USER_NOT_FOUND = "User Not Found";
	private static final String SUCCESS_MSG = "Success";

	public static CommonResponse formatCommonResponse(boolean validated) {
		if (validated) {
			return new CommonResponseBuilder().withStatus(OK).withMessage(SUCCESS_MSG).build();
		}
		return new CommonResponseBuilder().withStatus(NOT_FOUND).withMessage(USER_NOT_FOUND).build();
	}

}
