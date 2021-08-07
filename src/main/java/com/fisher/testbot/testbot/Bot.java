package com.fisher.testbot.testbot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class Bot extends TelegramWebhookBot {

    @Override
    public String getBotUsername() {
        return "AbbrBot";
    }

    @Override
    public String getBotToken() {
        return "1918878505:AAFxg-f7zG2gA_LqwoX7zzdTNO3RHiedz04";
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return new SendMessage(update.getMessage().getChatId().toString(), update.getMessage().getText());
    }

    @Override
    public String getBotPath() {
        return "https://fishertestbot.herokuapp.com/";
    }


}
