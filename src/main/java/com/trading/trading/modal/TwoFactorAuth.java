package com.trading.trading.modal;

import com.trading.trading.domain.VerificationType;
import jakarta.persistence.Entity;

@Entity
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VerificationType sendTo;
}
