/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashInForecast5;
import com.tools20022.repository.msg.CashOutForecast5;
import com.tools20022.repository.msg.NetCashForecast4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the cash-in and cash-out flows by country.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BreakdownByCountry2#mmCountry
 * BreakdownByCountry2.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#mmCashInForecast
 * BreakdownByCountry2.mmCashInForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#mmCashOutForecast
 * BreakdownByCountry2.mmCashOutForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#mmNetCashForecast
 * BreakdownByCountry2.mmNetCashForecast}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BreakdownByCountry2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash-in and cash-out flows by country."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BreakdownByCountry2", propOrder = {"country", "cashInForecast", "cashOutForecast", "netCashForecast"})
public class BreakdownByCountry2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ctry", required = true)
	protected CountryCode country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country for which the cash flow is being reported."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BreakdownByCountry2, CountryCode> mmCountry = new MMMessageAttribute<BreakdownByCountry2, CountryCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByCountry2.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country for which the cash flow is being reported.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(BreakdownByCountry2 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(BreakdownByCountry2 obj, CountryCode value) {
			obj.setCountry(value);
		}
	};
	@XmlElement(name = "CshInFcst")
	protected List<CashInForecast5> cashInForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast5
	 * CashInForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakdownByCountry2, List<CashInForecast5>> mmCashInForecast = new MMMessageAssociationEnd<BreakdownByCountry2, List<CashInForecast5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByCountry2.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashInForecast5.mmObject();
		}

		@Override
		public List<CashInForecast5> getValue(BreakdownByCountry2 obj) {
			return obj.getCashInForecast();
		}

		@Override
		public void setValue(BreakdownByCountry2 obj, List<CashInForecast5> value) {
			obj.setCashInForecast(value);
		}
	};
	@XmlElement(name = "CshOutFcst")
	protected List<CashOutForecast5> cashOutForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakdownByCountry2, List<CashOutForecast5>> mmCashOutForecast = new MMMessageAssociationEnd<BreakdownByCountry2, List<CashOutForecast5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByCountry2.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashOutForecast5.mmObject();
		}

		@Override
		public List<CashOutForecast5> getValue(BreakdownByCountry2 obj) {
			return obj.getCashOutForecast();
		}

		@Override
		public void setValue(BreakdownByCountry2 obj, List<CashOutForecast5> value) {
			obj.setCashOutForecast(value);
		}
	};
	@XmlElement(name = "NetCshFcst")
	protected List<NetCashForecast4> netCashForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash as a result of the cash-in and cash-out flows specified for the country."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakdownByCountry2, List<NetCashForecast4>> mmNetCashForecast = new MMMessageAssociationEnd<BreakdownByCountry2, List<NetCashForecast4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByCountry2.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the country.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetCashForecast4.mmObject();
		}

		@Override
		public List<NetCashForecast4> getValue(BreakdownByCountry2 obj) {
			return obj.getNetCashForecast();
		}

		@Override
		public void setValue(BreakdownByCountry2 obj, List<NetCashForecast4> value) {
			obj.setNetCashForecast(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BreakdownByCountry2.mmCountry, com.tools20022.repository.msg.BreakdownByCountry2.mmCashInForecast,
						com.tools20022.repository.msg.BreakdownByCountry2.mmCashOutForecast, com.tools20022.repository.msg.BreakdownByCountry2.mmNetCashForecast);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BreakdownByCountry2";
				definition = "Specifies the cash-in and cash-out flows by country.";
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getCountry() {
		return country;
	}

	public BreakdownByCountry2 setCountry(CountryCode country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public List<CashInForecast5> getCashInForecast() {
		return cashInForecast == null ? cashInForecast = new ArrayList<>() : cashInForecast;
	}

	public BreakdownByCountry2 setCashInForecast(List<CashInForecast5> cashInForecast) {
		this.cashInForecast = Objects.requireNonNull(cashInForecast);
		return this;
	}

	public List<CashOutForecast5> getCashOutForecast() {
		return cashOutForecast == null ? cashOutForecast = new ArrayList<>() : cashOutForecast;
	}

	public BreakdownByCountry2 setCashOutForecast(List<CashOutForecast5> cashOutForecast) {
		this.cashOutForecast = Objects.requireNonNull(cashOutForecast);
		return this;
	}

	public List<NetCashForecast4> getNetCashForecast() {
		return netCashForecast == null ? netCashForecast = new ArrayList<>() : netCashForecast;
	}

	public BreakdownByCountry2 setNetCashForecast(List<NetCashForecast4> netCashForecast) {
		this.netCashForecast = Objects.requireNonNull(netCashForecast);
		return this;
	}
}