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
import com.tools20022.repository.area.seev.MeetingNotificationV05;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.MeetingType3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalRights2;
import com.tools20022.repository.msg.MeetingContactPerson2;
import com.tools20022.repository.msg.PostalAddress1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the shareholders meeting, specifying the participation
 * requirements and the voting procedures. Alternatively, it may indicate where
 * such information may be obtained.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmMeetingIdentification
 * MeetingNotice4.mmMeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmIssuerMeetingIdentification
 * MeetingNotice4.mmIssuerMeetingIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice4#mmType
 * MeetingNotice4.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmClassification
 * MeetingNotice4.mmClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAnnouncementDate
 * MeetingNotice4.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceRequired
 * MeetingNotice4.mmAttendanceRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationInformation
 * MeetingNotice4.mmAttendanceConfirmationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationDeadline
 * MeetingNotice4.mmAttendanceConfirmationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationSTPDeadline
 * MeetingNotice4.mmAttendanceConfirmationSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationMarketDeadline
 * MeetingNotice4.mmAttendanceConfirmationMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAdditionalDocumentationURLAddress
 * MeetingNotice4.mmAdditionalDocumentationURLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAdditionalProcedureDetails
 * MeetingNotice4.mmAdditionalProcedureDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmTotalNumberOfSecuritiesOutstanding
 * MeetingNotice4.mmTotalNumberOfSecuritiesOutstanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmTotalNumberOfVotingRights
 * MeetingNotice4.mmTotalNumberOfVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmProxyAppointmentNotificationAddress
 * MeetingNotice4.mmProxyAppointmentNotificationAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice4#mmProxyChoice
 * MeetingNotice4.mmProxyChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmContactPersonDetails
 * MeetingNotice4.mmContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmResultPublicationDate
 * MeetingNotice4.mmResultPublicationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingNotice
 * MeetingNotice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmMeeting
 * MeetingNotificationV05.mmMeeting}</li>
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
 * "MeetingNotice4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the shareholders meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingNotice4", propOrder = {"meetingIdentification", "issuerMeetingIdentification", "type", "classification", "announcementDate", "attendanceRequired", "attendanceConfirmationInformation",
		"attendanceConfirmationDeadline", "attendanceConfirmationSTPDeadline", "attendanceConfirmationMarketDeadline", "additionalDocumentationURLAddress", "additionalProcedureDetails", "totalNumberOfSecuritiesOutstanding",
		"totalNumberOfVotingRights", "proxyAppointmentNotificationAddress", "proxyChoice", "contactPersonDetails", "resultPublicationDate"})
public class MeetingNotice4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MtgId")
	protected Max35Text meetingIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmIdentification
	 * Meeting.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to the general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<Max35Text>> mmMeetingIdentification = new MMMessageAttribute<MeetingNotice4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "MtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingIdentification";
			definition = "Identification assigned to the general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MeetingNotice4 obj) {
			return obj.getMeetingIdentification();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<Max35Text> value) {
			obj.setMeetingIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrMtgId")
	protected Max35Text issuerMeetingIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmIssuerMeetingIdentification
	 * IssuerMeeting.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrMtgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerMeetingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to the meeting by the issuer. It must be unique for the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<Max35Text>> mmIssuerMeetingIdentification = new MMMessageAttribute<MeetingNotice4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> IssuerMeeting.mmIssuerMeetingIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "IssrMtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerMeetingIdentification";
			definition = "Identification assigned to the meeting by the issuer. It must be unique for the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MeetingNotice4 obj) {
			return obj.getIssuerMeetingIdentification();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<Max35Text> value) {
			obj.setIssuerMeetingIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected MeetingType3Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType3Code
	 * MeetingType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmType
	 * Meeting.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of security holders meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, MeetingType3Code> mmType = new MMMessageAttribute<MeetingNotice4, MeetingType3Code>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of security holders meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingType3Code.mmObject();
		}

		@Override
		public MeetingType3Code getValue(MeetingNotice4 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(MeetingNotice4 obj, MeetingType3Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Clssfctn")
	protected MeetingTypeClassification1Choice classification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MeetingTypeClassification1Choice
	 * MeetingTypeClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingEventClassification
	 * Meeting.mmMeetingEventClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Clssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Classification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classifies the type of meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<MeetingTypeClassification1Choice>> mmClassification = new MMMessageAttribute<MeetingNotice4, Optional<MeetingTypeClassification1Choice>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmMeetingEventClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "Clssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Classification";
			definition = "Classifies the type of meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MeetingTypeClassification1Choice.mmObject();
		}

		@Override
		public Optional<MeetingTypeClassification1Choice> getValue(MeetingNotice4 obj) {
			return obj.getClassification();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<MeetingTypeClassification1Choice> value) {
			obj.setClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "AnncmntDt")
	protected ISODate announcementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
	 * CorporateActionEvent.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official meeting announcement date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<ISODate>> mmAnnouncementDate = new MMMessageAttribute<MeetingNotice4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Official meeting announcement date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MeetingNotice4 obj) {
			return obj.getAnnouncementDate();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<ISODate> value) {
			obj.setAnnouncementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncReqrd")
	protected YesNoIndicator attendanceRequired;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmAttendanceRequired
	 * Meeting.mmAttendanceRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether physical participation to the meeting is required in order to be allowed to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<YesNoIndicator>> mmAttendanceRequired = new MMMessageAttribute<MeetingNotice4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAttendanceRequired;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceRequired";
			definition = "Indicates whether physical participation to the meeting is required in order to be allowed to vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(MeetingNotice4 obj) {
			return obj.getAttendanceRequired();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<YesNoIndicator> value) {
			obj.setAttendanceRequired(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncConfInf")
	protected Max350Text attendanceConfirmationInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmAttendanceConfirmation
	 * Meeting.mmAttendanceConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncConfInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how to order the attendance card or to give notice of attendance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<Max350Text>> mmAttendanceConfirmationInformation = new MMMessageAttribute<MeetingNotice4, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAttendanceConfirmation;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationInformation";
			definition = "Indicates how to order the attendance card or to give notice of attendance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(MeetingNotice4 obj) {
			return obj.getAttendanceConfirmationInformation();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<Max350Text> value) {
			obj.setAttendanceConfirmationInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncConfDdln")
	protected DateFormat29Choice attendanceConfirmationDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncConfDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the beneficial owner or agent must notify of its intention to participate in the meeting. This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<DateFormat29Choice>> mmAttendanceConfirmationDeadline = new MMMessageAttribute<MeetingNotice4, Optional<DateFormat29Choice>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationDeadline";
			definition = "Date and time by which the beneficial owner or agent must notify of its intention to participate in the meeting. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}

		@Override
		public Optional<DateFormat29Choice> getValue(MeetingNotice4 obj) {
			return obj.getAttendanceConfirmationDeadline();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<DateFormat29Choice> value) {
			obj.setAttendanceConfirmationDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncConfSTPDdln")
	protected DateFormat29Choice attendanceConfirmationSTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncConfSTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmationSTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the beneficial owner or agent must notify of its intention to participate in the meeting (STP mode). This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<DateFormat29Choice>> mmAttendanceConfirmationSTPDeadline = new MMMessageAttribute<MeetingNotice4, Optional<DateFormat29Choice>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationSTPDeadline";
			definition = "Date and time by which the beneficial owner or agent must notify of its intention to participate in the meeting (STP mode). This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}

		@Override
		public Optional<DateFormat29Choice> getValue(MeetingNotice4 obj) {
			return obj.getAttendanceConfirmationSTPDeadline();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<DateFormat29Choice> value) {
			obj.setAttendanceConfirmationSTPDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncConfMktDdln")
	protected DateFormat29Choice attendanceConfirmationMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncConfMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmationMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the attendance to the meeting should be confirmed. This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<DateFormat29Choice>> mmAttendanceConfirmationMarketDeadline = new MMMessageAttribute<MeetingNotice4, Optional<DateFormat29Choice>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationMarketDeadline";
			definition = "Date and time by which the attendance to the meeting should be confirmed. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}

		@Override
		public Optional<DateFormat29Choice> getValue(MeetingNotice4 obj) {
			return obj.getAttendanceConfirmationMarketDeadline();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<DateFormat29Choice> value) {
			obj.setAttendanceConfirmationMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlDcmnttnURLAdr")
	protected Max256Text additionalDocumentationURLAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
	 * ElectronicAddress.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlDcmnttnURLAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentationURLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address to use over the www (HTTP) service where additional information on the meeting may be found."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<Max256Text>> mmAdditionalDocumentationURLAddress = new MMMessageAttribute<MeetingNotice4, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AddtlDcmnttnURLAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentationURLAddress";
			definition = "Address to use over the www (HTTP) service where additional information on the meeting may be found.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(MeetingNotice4 obj) {
			return obj.getAdditionalDocumentationURLAddress();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<Max256Text> value) {
			obj.setAdditionalDocumentationURLAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlPrcdrDtls")
	protected List<AdditionalRights2> additionalProcedureDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmAdditionalRight
	 * Meeting.mmAdditionalRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPrcdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProcedureDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional procedural information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, this may indicate where such information may be obtained."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingNotice4, List<AdditionalRights2>> mmAdditionalProcedureDetails = new MMMessageAssociationEnd<MeetingNotice4, List<AdditionalRights2>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAdditionalRight;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AddtlPrcdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalProcedureDetails";
			definition = "Additional procedural information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, this may indicate where such information may be obtained.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalRights2.mmObject();
		}

		@Override
		public List<AdditionalRights2> getValue(MeetingNotice4 obj) {
			return obj.getAdditionalProcedureDetails();
		}

		@Override
		public void setValue(MeetingNotice4 obj, List<AdditionalRights2> value) {
			obj.setAdditionalProcedureDetails(value);
		}
	};
	@XmlElement(name = "TtlNbOfSctiesOutsdng")
	protected UnitOrFaceAmount1Choice totalNumberOfSecuritiesOutstanding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfSecuritiesOutstanding
	 * MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfSctiesOutsdng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfSecuritiesOutstanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities admitted to the vote, expressed as an amount and a currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<UnitOrFaceAmount1Choice>> mmTotalNumberOfSecuritiesOutstanding = new MMMessageAttribute<MeetingNotice4, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfSctiesOutsdng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfSecuritiesOutstanding";
			definition = "Number of securities admitted to the vote, expressed as an amount and a currency.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(MeetingNotice4 obj) {
			return obj.getTotalNumberOfSecuritiesOutstanding();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setTotalNumberOfSecuritiesOutstanding(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfVtngRghts")
	protected Number totalNumberOfVotingRights;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfVotingRights
	 * MeetingParticipation.mmTotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfVtngRghts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfVotingRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of rights admitted to the vote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<Number>> mmTotalNumberOfVotingRights = new MMMessageAttribute<MeetingNotice4, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfVotingRights;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfVtngRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfVotingRights";
			definition = "Number of rights admitted to the vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(MeetingNotice4 obj) {
			return obj.getTotalNumberOfVotingRights();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<Number> value) {
			obj.setTotalNumberOfVotingRights(value.orElse(null));
		}
	};
	@XmlElement(name = "PrxyAppntmntNtfctnAdr")
	protected PostalAddress1 proxyAppointmentNotificationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyAppntmntNtfctnAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointmentNotificationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address where the information on the proxy should be sent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingNotice4, Optional<PostalAddress1>> mmProxyAppointmentNotificationAddress = new MMMessageAssociationEnd<MeetingNotice4, Optional<PostalAddress1>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "PrxyAppntmntNtfctnAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointmentNotificationAddress";
			definition = "Address where the information on the proxy should be sent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress1.mmObject();
		}

		@Override
		public Optional<PostalAddress1> getValue(MeetingNotice4 obj) {
			return obj.getProxyAppointmentNotificationAddress();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<PostalAddress1> value) {
			obj.setProxyAppointmentNotificationAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "PrxyChc")
	protected Proxy2Choice proxyChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Proxy2Choice
	 * Proxy2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
	 * Meeting.mmProxyAppointmentConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a proxy is allowed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingNotice4, Optional<Proxy2Choice>> mmProxyChoice = new MMMessageAssociationEnd<MeetingNotice4, Optional<Proxy2Choice>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmProxyAppointmentConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "PrxyChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyChoice";
			definition = "Indicates whether a proxy is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Proxy2Choice.mmObject();
		}

		@Override
		public Optional<Proxy2Choice> getValue(MeetingNotice4 obj) {
			return obj.getProxyChoice();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<Proxy2Choice> value) {
			obj.setProxyChoice(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctPrsnDtls")
	protected List<MeetingContactPerson2> contactPersonDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MeetingContactPerson2
	 * MeetingContactPerson2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctPrsnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPersonDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact person at the party organising the meeting, at the issuer or at an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingNotice4, List<MeetingContactPerson2>> mmContactPersonDetails = new MMMessageAssociationEnd<MeetingNotice4, List<MeetingContactPerson2>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPersonDetails";
			definition = "Contact person at the party organising the meeting, at the issuer or at an intermediary.";
			maxOccurs = 12;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MeetingContactPerson2.mmObject();
		}

		@Override
		public List<MeetingContactPerson2> getValue(MeetingNotice4 obj) {
			return obj.getContactPersonDetails();
		}

		@Override
		public void setValue(MeetingNotice4 obj, List<MeetingContactPerson2> value) {
			obj.setContactPersonDetails(value);
		}
	};
	@XmlElement(name = "RsltPblctnDt")
	protected DateFormat3Choice resultPublicationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat3Choice
	 * DateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmResultPublicationDate
	 * CorporateActionEvent.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltPblctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the company publishes the results of its meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice4, Optional<DateFormat3Choice>> mmResultPublicationDate = new MMMessageAttribute<MeetingNotice4, Optional<DateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmResultPublicationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "RsltPblctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which the company publishes the results of its meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat3Choice.mmObject();
		}

		@Override
		public Optional<DateFormat3Choice> getValue(MeetingNotice4 obj) {
			return obj.getResultPublicationDate();
		}

		@Override
		public void setValue(MeetingNotice4 obj, Optional<DateFormat3Choice> value) {
			obj.setResultPublicationDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice4.mmMeetingIdentification, com.tools20022.repository.msg.MeetingNotice4.mmIssuerMeetingIdentification,
						com.tools20022.repository.msg.MeetingNotice4.mmType, com.tools20022.repository.msg.MeetingNotice4.mmClassification, com.tools20022.repository.msg.MeetingNotice4.mmAnnouncementDate,
						com.tools20022.repository.msg.MeetingNotice4.mmAttendanceRequired, com.tools20022.repository.msg.MeetingNotice4.mmAttendanceConfirmationInformation,
						com.tools20022.repository.msg.MeetingNotice4.mmAttendanceConfirmationDeadline, com.tools20022.repository.msg.MeetingNotice4.mmAttendanceConfirmationSTPDeadline,
						com.tools20022.repository.msg.MeetingNotice4.mmAttendanceConfirmationMarketDeadline, com.tools20022.repository.msg.MeetingNotice4.mmAdditionalDocumentationURLAddress,
						com.tools20022.repository.msg.MeetingNotice4.mmAdditionalProcedureDetails, com.tools20022.repository.msg.MeetingNotice4.mmTotalNumberOfSecuritiesOutstanding,
						com.tools20022.repository.msg.MeetingNotice4.mmTotalNumberOfVotingRights, com.tools20022.repository.msg.MeetingNotice4.mmProxyAppointmentNotificationAddress,
						com.tools20022.repository.msg.MeetingNotice4.mmProxyChoice, com.tools20022.repository.msg.MeetingNotice4.mmContactPersonDetails, com.tools20022.repository.msg.MeetingNotice4.mmResultPublicationDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV05.mmMeeting);
				trace_lazy = () -> MeetingNotice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingNotice4";
				definition = "Information about the shareholders meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMeetingIdentification() {
		return meetingIdentification == null ? Optional.empty() : Optional.of(meetingIdentification);
	}

	public MeetingNotice4 setMeetingIdentification(Max35Text meetingIdentification) {
		this.meetingIdentification = meetingIdentification;
		return this;
	}

	public Optional<Max35Text> getIssuerMeetingIdentification() {
		return issuerMeetingIdentification == null ? Optional.empty() : Optional.of(issuerMeetingIdentification);
	}

	public MeetingNotice4 setIssuerMeetingIdentification(Max35Text issuerMeetingIdentification) {
		this.issuerMeetingIdentification = issuerMeetingIdentification;
		return this;
	}

	public MeetingType3Code getType() {
		return type;
	}

	public MeetingNotice4 setType(MeetingType3Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<MeetingTypeClassification1Choice> getClassification() {
		return classification == null ? Optional.empty() : Optional.of(classification);
	}

	public MeetingNotice4 setClassification(MeetingTypeClassification1Choice classification) {
		this.classification = classification;
		return this;
	}

	public Optional<ISODate> getAnnouncementDate() {
		return announcementDate == null ? Optional.empty() : Optional.of(announcementDate);
	}

	public MeetingNotice4 setAnnouncementDate(ISODate announcementDate) {
		this.announcementDate = announcementDate;
		return this;
	}

	public Optional<YesNoIndicator> getAttendanceRequired() {
		return attendanceRequired == null ? Optional.empty() : Optional.of(attendanceRequired);
	}

	public MeetingNotice4 setAttendanceRequired(YesNoIndicator attendanceRequired) {
		this.attendanceRequired = attendanceRequired;
		return this;
	}

	public Optional<Max350Text> getAttendanceConfirmationInformation() {
		return attendanceConfirmationInformation == null ? Optional.empty() : Optional.of(attendanceConfirmationInformation);
	}

	public MeetingNotice4 setAttendanceConfirmationInformation(Max350Text attendanceConfirmationInformation) {
		this.attendanceConfirmationInformation = attendanceConfirmationInformation;
		return this;
	}

	public Optional<DateFormat29Choice> getAttendanceConfirmationDeadline() {
		return attendanceConfirmationDeadline == null ? Optional.empty() : Optional.of(attendanceConfirmationDeadline);
	}

	public MeetingNotice4 setAttendanceConfirmationDeadline(DateFormat29Choice attendanceConfirmationDeadline) {
		this.attendanceConfirmationDeadline = attendanceConfirmationDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getAttendanceConfirmationSTPDeadline() {
		return attendanceConfirmationSTPDeadline == null ? Optional.empty() : Optional.of(attendanceConfirmationSTPDeadline);
	}

	public MeetingNotice4 setAttendanceConfirmationSTPDeadline(DateFormat29Choice attendanceConfirmationSTPDeadline) {
		this.attendanceConfirmationSTPDeadline = attendanceConfirmationSTPDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getAttendanceConfirmationMarketDeadline() {
		return attendanceConfirmationMarketDeadline == null ? Optional.empty() : Optional.of(attendanceConfirmationMarketDeadline);
	}

	public MeetingNotice4 setAttendanceConfirmationMarketDeadline(DateFormat29Choice attendanceConfirmationMarketDeadline) {
		this.attendanceConfirmationMarketDeadline = attendanceConfirmationMarketDeadline;
		return this;
	}

	public Optional<Max256Text> getAdditionalDocumentationURLAddress() {
		return additionalDocumentationURLAddress == null ? Optional.empty() : Optional.of(additionalDocumentationURLAddress);
	}

	public MeetingNotice4 setAdditionalDocumentationURLAddress(Max256Text additionalDocumentationURLAddress) {
		this.additionalDocumentationURLAddress = additionalDocumentationURLAddress;
		return this;
	}

	public List<AdditionalRights2> getAdditionalProcedureDetails() {
		return additionalProcedureDetails == null ? additionalProcedureDetails = new ArrayList<>() : additionalProcedureDetails;
	}

	public MeetingNotice4 setAdditionalProcedureDetails(List<AdditionalRights2> additionalProcedureDetails) {
		this.additionalProcedureDetails = Objects.requireNonNull(additionalProcedureDetails);
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getTotalNumberOfSecuritiesOutstanding() {
		return totalNumberOfSecuritiesOutstanding == null ? Optional.empty() : Optional.of(totalNumberOfSecuritiesOutstanding);
	}

	public MeetingNotice4 setTotalNumberOfSecuritiesOutstanding(UnitOrFaceAmount1Choice totalNumberOfSecuritiesOutstanding) {
		this.totalNumberOfSecuritiesOutstanding = totalNumberOfSecuritiesOutstanding;
		return this;
	}

	public Optional<Number> getTotalNumberOfVotingRights() {
		return totalNumberOfVotingRights == null ? Optional.empty() : Optional.of(totalNumberOfVotingRights);
	}

	public MeetingNotice4 setTotalNumberOfVotingRights(Number totalNumberOfVotingRights) {
		this.totalNumberOfVotingRights = totalNumberOfVotingRights;
		return this;
	}

	public Optional<PostalAddress1> getProxyAppointmentNotificationAddress() {
		return proxyAppointmentNotificationAddress == null ? Optional.empty() : Optional.of(proxyAppointmentNotificationAddress);
	}

	public MeetingNotice4 setProxyAppointmentNotificationAddress(PostalAddress1 proxyAppointmentNotificationAddress) {
		this.proxyAppointmentNotificationAddress = proxyAppointmentNotificationAddress;
		return this;
	}

	public Optional<Proxy2Choice> getProxyChoice() {
		return proxyChoice == null ? Optional.empty() : Optional.of(proxyChoice);
	}

	public MeetingNotice4 setProxyChoice(Proxy2Choice proxyChoice) {
		this.proxyChoice = proxyChoice;
		return this;
	}

	public List<MeetingContactPerson2> getContactPersonDetails() {
		return contactPersonDetails == null ? contactPersonDetails = new ArrayList<>() : contactPersonDetails;
	}

	public MeetingNotice4 setContactPersonDetails(List<MeetingContactPerson2> contactPersonDetails) {
		this.contactPersonDetails = Objects.requireNonNull(contactPersonDetails);
		return this;
	}

	public Optional<DateFormat3Choice> getResultPublicationDate() {
		return resultPublicationDate == null ? Optional.empty() : Optional.of(resultPublicationDate);
	}

	public MeetingNotice4 setResultPublicationDate(DateFormat3Choice resultPublicationDate) {
		this.resultPublicationDate = resultPublicationDate;
		return this;
	}
}