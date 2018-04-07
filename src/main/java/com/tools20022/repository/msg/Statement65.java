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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV07;
import com.tools20022.repository.choice.DateAndDateTime2Choice;
import com.tools20022.repository.choice.DateOrDateTimePeriod2Choice;
import com.tools20022.repository.choice.Frequency25Choice;
import com.tools20022.repository.choice.UpdateType15Choice;
import com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code;
import com.tools20022.repository.codeset.CorporateActionStatementType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General characteristics related to a statement which reports information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Statement65#mmStatementType
 * Statement65.mmStatementType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement65#mmReportingType
 * Statement65.mmReportingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement65#mmStatementIdentification
 * Statement65.mmStatementIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement65#mmReportNumber
 * Statement65.mmReportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement65#mmStatementDateTime
 * Statement65.mmStatementDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement65#mmFrequency
 * Statement65.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement65#mmUpdateType
 * Statement65.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement65#mmActivityIndicator
 * Statement65.mmActivityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement65#mmNotificationDeadlinePeriod
 * Statement65.mmNotificationDeadlinePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV07#mmStatementGeneralDetails
 * CorporateActionInstructionStatementReportV07.mmStatementGeneralDetails}</li>
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
 * "Statement65"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General characteristics related to a statement which reports information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Statement65", propOrder = {"statementType", "reportingType", "statementIdentification", "reportNumber", "statementDateTime", "frequency", "updateType", "activityIndicator", "notificationDeadlinePeriod"})
public class Statement65 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtTp", required = true)
	protected CorporateActionStatementType1Code statementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementType1Code
	 * CorporateActionStatementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement contains missing instructions only or all instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement65, CorporateActionStatementType1Code> mmStatementType = new MMMessageAttribute<Statement65, CorporateActionStatementType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement65.mmObject();
			isDerived = false;
			xmlTag = "StmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementType";
			definition = "Indicates whether the statement contains missing instructions only or all instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionStatementType1Code.mmObject();
		}

		@Override
		public CorporateActionStatementType1Code getValue(Statement65 obj) {
			return obj.getStatementType();
		}

		@Override
		public void setValue(Statement65 obj, CorporateActionStatementType1Code value) {
			obj.setStatementType(value);
		}
	};
	@XmlElement(name = "RptgTp", required = true)
	protected CorporateActionStatementReportingType1Code reportingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code
	 * CorporateActionStatementReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement report on account holdings for corporate action events is for single account/multiple events or multiple accounts/single event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement65, CorporateActionStatementReportingType1Code> mmReportingType = new MMMessageAttribute<Statement65, CorporateActionStatementReportingType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement65.mmObject();
			isDerived = false;
			xmlTag = "RptgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingType";
			definition = "Indicates whether the statement report on account holdings for corporate action events is for single account/multiple events or multiple accounts/single event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionStatementReportingType1Code.mmObject();
		}

		@Override
		public CorporateActionStatementReportingType1Code getValue(Statement65 obj) {
			return obj.getReportingType();
		}

		@Override
		public void setValue(Statement65 obj, CorporateActionStatementReportingType1Code value) {
			obj.setReportingType(value);
		}
	};
	@XmlElement(name = "StmtId", required = true)
	protected Max35Text statementIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement65, Max35Text> mmStatementIdentification = new MMMessageAttribute<Statement65, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement65.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Reference of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Statement65 obj) {
			return obj.getStatementIdentification();
		}

		@Override
		public void setValue(Statement65 obj, Max35Text value) {
			obj.setStatementIdentification(value);
		}
	};
	@XmlElement(name = "RptNb")
	protected Max5NumericText reportNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::STAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement65, Optional<Max5NumericText>> mmReportNumber = new MMMessageAttribute<Statement65, Optional<Max5NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement65.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Optional<Max5NumericText> getValue(Statement65 obj) {
			return obj.getReportNumber();
		}

		@Override
		public void setValue(Statement65 obj, Optional<Max5NumericText> value) {
			obj.setReportNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtDtTm", required = true)
	protected DateAndDateTime2Choice statementDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::STAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement65, DateAndDateTime2Choice> mmStatementDateTime = new MMMessageAttribute<Statement65, DateAndDateTime2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement65.mmObject();
			isDerived = false;
			xmlTag = "StmtDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateTime";
			definition = "Date of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTime2Choice.mmObject();
		}

		@Override
		public DateAndDateTime2Choice getValue(Statement65 obj) {
			return obj.getStatementDateTime();
		}

		@Override
		public void setValue(Statement65 obj, DateAndDateTime2Choice value) {
			obj.setStatementDateTime(value);
		}
	};
	@XmlElement(name = "Frqcy", required = true)
	protected Frequency25Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency25Choice
	 * Frequency25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SFRE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement65, Frequency25Choice> mmFrequency = new MMMessageAttribute<Statement65, Frequency25Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement65.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SFRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency25Choice.mmObject();
		}

		@Override
		public Frequency25Choice getValue(Statement65 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(Statement65 obj, Frequency25Choice value) {
			obj.setFrequency(value);
		}
	};
	@XmlElement(name = "UpdTp", required = true)
	protected UpdateType15Choice updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType15Choice
	 * UpdateType15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CODE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the report is complete or contains changes only."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement65, UpdateType15Choice> mmUpdateType = new MMMessageAttribute<Statement65, UpdateType15Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement65.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CODE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the report is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UpdateType15Choice.mmObject();
		}

		@Override
		public UpdateType15Choice getValue(Statement65 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(Statement65 obj, UpdateType15Choice value) {
			obj.setUpdateType(value);
		}
	};
	@XmlElement(name = "ActvtyInd", required = true)
	protected YesNoIndicator activityIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACTI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is activity or information update reported in the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement65, YesNoIndicator> mmActivityIndicator = new MMMessageAttribute<Statement65, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement65.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACTI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or information update reported in the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Statement65 obj) {
			return obj.getActivityIndicator();
		}

		@Override
		public void setValue(Statement65 obj, YesNoIndicator value) {
			obj.setActivityIndicator(value);
		}
	};
	@XmlElement(name = "NtfctnDdlnPrd")
	protected DateOrDateTimePeriod2Choice notificationDeadlinePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod2Choice
	 * DateOrDateTimePeriod2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnDdlnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationDeadlinePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which identification deadline has been set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement65, Optional<DateOrDateTimePeriod2Choice>> mmNotificationDeadlinePeriod = new MMMessageAssociationEnd<Statement65, Optional<DateOrDateTimePeriod2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement65.mmObject();
			isDerived = false;
			xmlTag = "NtfctnDdlnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationDeadlinePeriod";
			definition = "Period during which identification deadline has been set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateOrDateTimePeriod2Choice.mmObject();
		}

		@Override
		public Optional<DateOrDateTimePeriod2Choice> getValue(Statement65 obj) {
			return obj.getNotificationDeadlinePeriod();
		}

		@Override
		public void setValue(Statement65 obj, Optional<DateOrDateTimePeriod2Choice> value) {
			obj.setNotificationDeadlinePeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Statement65.mmStatementType, com.tools20022.repository.msg.Statement65.mmReportingType,
						com.tools20022.repository.msg.Statement65.mmStatementIdentification, com.tools20022.repository.msg.Statement65.mmReportNumber, com.tools20022.repository.msg.Statement65.mmStatementDateTime,
						com.tools20022.repository.msg.Statement65.mmFrequency, com.tools20022.repository.msg.Statement65.mmUpdateType, com.tools20022.repository.msg.Statement65.mmActivityIndicator,
						com.tools20022.repository.msg.Statement65.mmNotificationDeadlinePeriod);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionStatementReportV07.mmStatementGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Statement65";
				definition = "General characteristics related to a statement which reports information.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionStatementType1Code getStatementType() {
		return statementType;
	}

	public Statement65 setStatementType(CorporateActionStatementType1Code statementType) {
		this.statementType = Objects.requireNonNull(statementType);
		return this;
	}

	public CorporateActionStatementReportingType1Code getReportingType() {
		return reportingType;
	}

	public Statement65 setReportingType(CorporateActionStatementReportingType1Code reportingType) {
		this.reportingType = Objects.requireNonNull(reportingType);
		return this;
	}

	public Max35Text getStatementIdentification() {
		return statementIdentification;
	}

	public Statement65 setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = Objects.requireNonNull(statementIdentification);
		return this;
	}

	public Optional<Max5NumericText> getReportNumber() {
		return reportNumber == null ? Optional.empty() : Optional.of(reportNumber);
	}

	public Statement65 setReportNumber(Max5NumericText reportNumber) {
		this.reportNumber = reportNumber;
		return this;
	}

	public DateAndDateTime2Choice getStatementDateTime() {
		return statementDateTime;
	}

	public Statement65 setStatementDateTime(DateAndDateTime2Choice statementDateTime) {
		this.statementDateTime = Objects.requireNonNull(statementDateTime);
		return this;
	}

	public Frequency25Choice getFrequency() {
		return frequency;
	}

	public Statement65 setFrequency(Frequency25Choice frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public UpdateType15Choice getUpdateType() {
		return updateType;
	}

	public Statement65 setUpdateType(UpdateType15Choice updateType) {
		this.updateType = Objects.requireNonNull(updateType);
		return this;
	}

	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public Statement65 setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = Objects.requireNonNull(activityIndicator);
		return this;
	}

	public Optional<DateOrDateTimePeriod2Choice> getNotificationDeadlinePeriod() {
		return notificationDeadlinePeriod == null ? Optional.empty() : Optional.of(notificationDeadlinePeriod);
	}

	public Statement65 setNotificationDeadlinePeriod(DateOrDateTimePeriod2Choice notificationDeadlinePeriod) {
		this.notificationDeadlinePeriod = notificationDeadlinePeriod;
		return this;
	}
}