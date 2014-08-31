package com.skrot.example.disruptor;

import com.lmax.disruptor.EventFactory;

public class ApprovedEvent {
	public String remarks;
	
	public ApprovedEvent(String remarks) {
		this.remarks = remarks;
	}
	
	public static EventFactory<ApprovedEvent> FACTORY = new EventFactory<ApprovedEvent>() {

		@Override
		public ApprovedEvent newInstance() {
			return new ApprovedEvent("");
		}
	};
}