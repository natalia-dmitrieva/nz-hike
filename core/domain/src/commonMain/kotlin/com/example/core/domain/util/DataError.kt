package com.example.core.domain.util

sealed interface DataError: Error {
	enum class Remote: DataError {
		BAD_REQUEST,
		REQUEST_TIMEOUT,
		UNAUTHORISED,
		FORBIDDEN,
		NOT_FOUND,
		CONFLICT,
		TOO_MANY_REQUESTS,
		NO_INTERNET,
		PAYLOAD_TOO_LARGE,
		SERVER_ERROR,
		SERVICE_UNAVAILABLE,
		SERIALIZATION,
		UNKNOWN
	}

	enum class Local: DataError {
		DISK_FULL,
		NOT_FOUND,
		UNKNOWN
	}
}