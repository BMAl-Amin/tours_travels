package com.bdtravels.service.interfaces;

import com.bdtravels.models.AutoGettingItemModel;

public interface AutoGettingItemInterface {
	public String makeFileUrl(AutoGettingItemModel autoGetModel);
	public String countToday();
}
