// Copyright (c) 2003-present, Jodd Team (http://jodd.org)
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice,
// this list of conditions and the following disclaimer.
//
// 2. Redistributions in binary form must reproduce the above copyright
// notice, this list of conditions and the following disclaimer in the
// documentation and/or other materials provided with the distribution.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
// LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
// CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
// INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.

package jodd.proxetta.data;

import jodd.datetime.JDateTime;
import jodd.proxetta.ProxyTarget;
import jodd.proxetta.ProxyTargetInfo;
import jodd.util.MathUtil;
import jodd.util.ThreadUtil;

public class DateDao2 {

	public JDateTime currentTime0() {
		ThreadUtil.sleep(MathUtil.randomLong(1, 2));
		return new JDateTime(System.currentTimeMillis());
	}


	public Object currentTime() {
		final long start = System.currentTimeMillis();

		ProxyTargetInfo proxyTargetInfo = new ProxyTargetInfo();
		proxyTargetInfo.argumentCount = 0;
		proxyTargetInfo.argumentsClasses = new Class[0];
		proxyTargetInfo.arguments = new Object[0];
		proxyTargetInfo.returnType = JDateTime.class;
		proxyTargetInfo.targetMethodName = "currentTime";
		proxyTargetInfo.targetMethodDescription = "()Ljodd/dateitme/JDateTime;";

		long end = start;

		try {
			return currentTime0();
		}
		catch (Exception e) {
			throw e;
		}
		finally {
			end = System.currentTimeMillis();
			System.out.println((end-start));
		}
	}

}
