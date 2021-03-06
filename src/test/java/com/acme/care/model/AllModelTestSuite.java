package com.acme.care.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.acme.care.model.user.AddressTest;
import com.acme.care.model.user.CareSeekerTest;
import com.acme.care.model.user.CareTeamTest;
import com.acme.care.model.user.CredentialTest;
import com.acme.care.model.user.EmailTest;
import com.acme.care.model.user.HireeTest;
import com.acme.care.model.user.LocationTest;
import com.acme.care.model.user.NameTest;
import com.acme.care.model.user.PasswordTest;
import com.acme.care.model.user.UserTest;

@RunWith(Suite.class)
@SuiteClasses({
	AddressTest.class,
	CareSeekerTest.class,
	CareTeamTest.class,
	CredentialTest.class,
	EmailTest.class,
	HireeTest.class,
	LocationTest.class,
	NameTest.class,
	PasswordTest.class,
	UserTest.class
})
public class AllModelTestSuite {}