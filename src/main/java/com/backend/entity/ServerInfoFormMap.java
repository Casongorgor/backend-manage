package com.backend.entity;

import com.backend.annotation.TableSeg;
import com.backend.util.FormMap;

@TableSeg(tableName = "ly_server_info", id="id")
public class ServerInfoFormMap extends FormMap<String, Object> {
	private static final long serialVersionUID = 1L;
}