package org.testng.eclipse.ui;

import org.testng.remote.strprotocol.TestMessage;

/**
 * Interface mimicking {@link org.testng.remote.strprotocol.IRemoteTestListener),
 * but working with {@link RunInfo} class to publish test results.
 *
 * @author Jean-Noel Rouvignac
 */
public interface ITestListener {

  void onStart(TestMessage tm);

  void onFinish(TestMessage tm);

  void onTestResult(RunInfo runInfo);

}

