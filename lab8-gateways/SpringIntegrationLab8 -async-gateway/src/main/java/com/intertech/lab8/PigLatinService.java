package com.intertech.lab8;

import java.util.concurrent.Future;

public interface PigLatinService {

	Future<String> translate(String english);

}
