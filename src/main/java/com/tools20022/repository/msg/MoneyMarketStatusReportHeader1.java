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
import com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01;
import com.tools20022.repository.codeset.StatisticalReportingStatus1Code;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriod1;
import com.tools20022.repository.msg.GenericValidationRuleIdentification1;
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
 * Provides the money market statistical status report header details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmReportingAgent
 * MoneyMarketStatusReportHeader1.mmReportingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmReportingPeriod
 * MoneyMarketStatusReportHeader1.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmReportStatus
 * MoneyMarketStatusReportHeader1.mmReportStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmValidationRule
 * MoneyMarketStatusReportHeader1.mmValidationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01#mmStatusReportHeader
 * MoneyMarketStatisticalReportStatusAdviceV01.mmStatusReportHeader}</li>
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
 * "MoneyMarketStatusReportHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the money market statistical status report header details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MoneyMarketStatusReportHeader1", propOrder = {"reportingAgent", "reportingPeriod", "reportStatus", "validationRule"})
public class MoneyMarketStatusReportHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptgAgt", required = true)
	protected LEIIdentifier reportingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
	 * MoneyMarketStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent which is subject to reporting requirements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MoneyMarketStatusReportHeader1, LEIIdentifier> mmReportingAgent = new MMMessageAttribute<MoneyMarketStatusReportHeader1, LEIIdentifier>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MoneyMarketStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingAgent";
			definition = "Agent which is subject to reporting requirements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public LEIIdentifier getValue(MoneyMarketStatusReportHeader1 obj) {
			return obj.getReportingAgent();
		}

		@Override
		public void setValue(MoneyMarketStatusReportHeader1 obj, LEIIdentifier value) {
			obj.setReportingAgent(value);
		}
	};
	@XmlElement(name = "RptgPrd", required = true)
	protected DateTimePeriod1 reportingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriod1
	 * DateTimePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
	 * MoneyMarketStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For daily reporting this is the day to which the transaction data in the status message refers (trade date or amendment date if there are corrections).\r\nFor periodic reporting this is the first and the last day to which the transaction data in the status message refers (trade date or amendment date in case of corrections)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MoneyMarketStatusReportHeader1, DateTimePeriod1> mmReportingPeriod = new MMMessageAssociationEnd<MoneyMarketStatusReportHeader1, DateTimePeriod1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MoneyMarketStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "For daily reporting this is the day to which the transaction data in the status message refers (trade date or amendment date if there are corrections).\r\nFor periodic reporting this is the first and the last day to which the transaction data in the status message refers (trade date or amendment date in case of corrections).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateTimePeriod1.mmObject();
		}

		@Override
		public DateTimePeriod1 getValue(MoneyMarketStatusReportHeader1 obj) {
			return obj.getReportingPeriod();
		}

		@Override
		public void setValue(MoneyMarketStatusReportHeader1 obj, DateTimePeriod1 value) {
			obj.setReportingPeriod(value);
		}
	};
	@XmlElement(name = "RptSts", required = true)
	protected StatisticalReportingStatus1Code reportStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus1Code
	 * StatisticalReportingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
	 * MoneyMarketStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status for the full report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MoneyMarketStatusReportHeader1, StatisticalReportingStatus1Code> mmReportStatus = new MMMessageAttribute<MoneyMarketStatusReportHeader1, StatisticalReportingStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MoneyMarketStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportStatus";
			definition = "Provides the status for the full report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatisticalReportingStatus1Code.mmObject();
		}

		@Override
		public StatisticalReportingStatus1Code getValue(MoneyMarketStatusReportHeader1 obj) {
			return obj.getReportStatus();
		}

		@Override
		public void setValue(MoneyMarketStatusReportHeader1 obj, StatisticalReportingStatus1Code value) {
			obj.setReportStatus(value);
		}
	};
	@XmlElement(name = "VldtnRule")
	protected List<GenericValidationRuleIdentification1> validationRule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1
	 * GenericValidationRuleIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
	 * MoneyMarketStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the details of the rule which could not be validated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MoneyMarketStatusReportHeader1, List<GenericValidationRuleIdentification1>> mmValidationRule = new MMMessageAssociationEnd<MoneyMarketStatusReportHeader1, List<GenericValidationRuleIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MoneyMarketStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "VldtnRule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationRule";
			definition = "Provides the details of the rule which could not be validated.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericValidationRuleIdentification1.mmObject();
		}

		@Override
		public List<GenericValidationRuleIdentification1> getValue(MoneyMarketStatusReportHeader1 obj) {
			return obj.getValidationRule();
		}

		@Override
		public void setValue(MoneyMarketStatusReportHeader1 obj, List<GenericValidationRuleIdentification1> value) {
			obj.setValidationRule(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MoneyMarketStatusReportHeader1.mmReportingAgent, com.tools20022.repository.msg.MoneyMarketStatusReportHeader1.mmReportingPeriod,
						com.tools20022.repository.msg.MoneyMarketStatusReportHeader1.mmReportStatus, com.tools20022.repository.msg.MoneyMarketStatusReportHeader1.mmValidationRule);
				messageBuildingBlock_lazy = () -> Arrays.asList(MoneyMarketStatisticalReportStatusAdviceV01.mmStatusReportHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketStatusReportHeader1";
				definition = "Provides the money market statistical status report header details.";
			}
		});
		return mmObject_lazy.get();
	}

	public LEIIdentifier getReportingAgent() {
		return reportingAgent;
	}

	public MoneyMarketStatusReportHeader1 setReportingAgent(LEIIdentifier reportingAgent) {
		this.reportingAgent = Objects.requireNonNull(reportingAgent);
		return this;
	}

	public DateTimePeriod1 getReportingPeriod() {
		return reportingPeriod;
	}

	public MoneyMarketStatusReportHeader1 setReportingPeriod(DateTimePeriod1 reportingPeriod) {
		this.reportingPeriod = Objects.requireNonNull(reportingPeriod);
		return this;
	}

	public StatisticalReportingStatus1Code getReportStatus() {
		return reportStatus;
	}

	public MoneyMarketStatusReportHeader1 setReportStatus(StatisticalReportingStatus1Code reportStatus) {
		this.reportStatus = Objects.requireNonNull(reportStatus);
		return this;
	}

	public List<GenericValidationRuleIdentification1> getValidationRule() {
		return validationRule == null ? validationRule = new ArrayList<>() : validationRule;
	}

	public MoneyMarketStatusReportHeader1 setValidationRule(List<GenericValidationRuleIdentification1> validationRule) {
		this.validationRule = Objects.requireNonNull(validationRule);
		return this;
	}
}