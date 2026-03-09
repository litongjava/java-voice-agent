package com.litongjava.voice.agent.sip;

import com.litongjava.template.PromptEngine;
import com.litongjava.voice.agent.bridge.RealtimeSetup;

public final class RealtimeSetupFactory {

  private RealtimeSetupFactory() {

  }

  public static RealtimeSetup buildFromEnv() {
    String systemPrompt = PromptEngine.renderToString("VOICE_AGENT_SYSTEM_PROMPT");
    String userPrompt = PromptEngine.renderToString("VOICE_AGENT_USER_PROMPT");
    String jobDescription = PromptEngine.renderToString("VOICE_AGENT_JOB_DESCRIPTION");
    String resume = PromptEngine.renderToString("VOICE_AGENT_RESUME");
    String questions = PromptEngine.renderToString("VOICE_AGENT_QUESTIONS");
    String greeting = PromptEngine.renderToString("VOICE_AGENT_GREETING");

    return new RealtimeSetup(systemPrompt, userPrompt, jobDescription, resume, questions, greeting);
  }
}