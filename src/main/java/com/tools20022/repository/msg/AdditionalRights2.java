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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AdditionalRightCode1Choice;
import com.tools20022.repository.choice.AdditionalRightThreshold1Choice;
import com.tools20022.repository.choice.DateFormat29Choice;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.entity.AdditionalRight;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.Meeting;
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
 * Information about the general meeting, specifying the participation
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
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRight
 * AdditionalRights2.mmAdditionalRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightInformationURLAddress
 * AdditionalRights2.mmAdditionalRightInformationURLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightDeadline
 * AdditionalRights2.mmAdditionalRightDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightMarketDeadline
 * AdditionalRights2.mmAdditionalRightMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightThreshold
 * AdditionalRights2.mmAdditionalRightThreshold}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AdditionalRight
 * AdditionalRight}</li>
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
 * "AdditionalRights2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalRights2", propOrder = {"additionalRight", "additionalRightInformationURLAddress", "additionalRightDeadline", "additionalRightMarketDeadline", "additionalRightThreshold"})
public class AdditionalRights2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlRght", required = true)
	protected AdditionalRightCode1Choice additionalRight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalRightCode1Choice
	 * AdditionalRightCode1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmType
	 * AdditionalRight.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific rights granted to the shareholders that can be exercised at shareholders meetings, for example, the right to ask questions, the right to add items to the agenda or table draft resolutions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalRights2, AdditionalRightCode1Choice> mmAdditionalRight = new MMMessageAttribute<AdditionalRights2, AdditionalRightCode1Choice>() {
		{
			businessElementTrace_lazy = () -> AdditionalRight.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRight";
			definition = "Specific rights granted to the shareholders that can be exercised at shareholders meetings, for example, the right to ask questions, the right to add items to the agenda or table draft resolutions.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalRightCode1Choice.mmObject();
		}

		@Override
		public AdditionalRightCode1Choice getValue(AdditionalRights2 obj) {
			return obj.getAdditionalRight();
		}

		@Override
		public void setValue(AdditionalRights2 obj, AdditionalRightCode1Choice value) {
			obj.setAdditionalRight(value);
		}
	};
	@XmlElement(name = "AddtlRghtInfURLAdr")
	protected Max256Text additionalRightInformationURLAddress;
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtInfURLAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightInformationURLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address to use over the www (HTTP) service where additional information on specific rights granted to the shareholders can be found."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalRights2, Optional<Max256Text>> mmAdditionalRightInformationURLAddress = new MMMessageAttribute<AdditionalRights2, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtInfURLAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightInformationURLAddress";
			definition = "Address to use over the www (HTTP) service where additional information on specific rights granted to the shareholders can be found.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(AdditionalRights2 obj) {
			return obj.getAdditionalRightInformationURLAddress();
		}

		@Override
		public void setValue(AdditionalRights2 obj, Optional<Max256Text> value) {
			obj.setAdditionalRightInformationURLAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRghtDdln")
	protected DateFormat29Choice additionalRightDeadline;
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
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
	 * Meeting.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to determine the date and time by which security holders can propose amendments or new resolutions. This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalRights2, Optional<DateFormat29Choice>> mmAdditionalRightDeadline = new MMMessageAttribute<AdditionalRights2, Optional<DateFormat29Choice>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightDeadline";
			definition = "Additional right granted to determine the date and time by which security holders can propose amendments or new resolutions. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}

		@Override
		public Optional<DateFormat29Choice> getValue(AdditionalRights2 obj) {
			return obj.getAdditionalRightDeadline();
		}

		@Override
		public void setValue(AdditionalRights2 obj, Optional<DateFormat29Choice> value) {
			obj.setAdditionalRightDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRghtMktDdln")
	protected DateFormat29Choice additionalRightMarketDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to determine the date and time by which security holders can propose amendments or new resolutions. This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalRights2, Optional<DateFormat29Choice>> mmAdditionalRightMarketDeadline = new MMMessageAttribute<AdditionalRights2, Optional<DateFormat29Choice>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightMarketDeadline";
			definition = "Additional right granted to determine the date and time by which security holders can propose amendments or new resolutions. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}

		@Override
		public Optional<DateFormat29Choice> getValue(AdditionalRights2 obj) {
			return obj.getAdditionalRightMarketDeadline();
		}

		@Override
		public void setValue(AdditionalRights2 obj, Optional<DateFormat29Choice> value) {
			obj.setAdditionalRightMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRghtThrshld")
	protected AdditionalRightThreshold1Choice additionalRightThreshold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalRightThreshold1Choice
	 * AdditionalRightThreshold1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmAdditionalRightThreshold
	 * AdditionalRight.mmAdditionalRightThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtThrshld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalRights2, Optional<AdditionalRightThreshold1Choice>> mmAdditionalRightThreshold = new MMMessageAttribute<AdditionalRights2, Optional<AdditionalRightThreshold1Choice>>() {
		{
			businessElementTrace_lazy = () -> AdditionalRight.mmAdditionalRightThreshold;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalRights2.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightThreshold";
			definition = "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalRightThreshold1Choice.mmObject();
		}

		@Override
		public Optional<AdditionalRightThreshold1Choice> getValue(AdditionalRights2 obj) {
			return obj.getAdditionalRightThreshold();
		}

		@Override
		public void setValue(AdditionalRights2 obj, Optional<AdditionalRightThreshold1Choice> value) {
			obj.setAdditionalRightThreshold(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalRights2.mmAdditionalRight, com.tools20022.repository.msg.AdditionalRights2.mmAdditionalRightInformationURLAddress,
						com.tools20022.repository.msg.AdditionalRights2.mmAdditionalRightDeadline, com.tools20022.repository.msg.AdditionalRights2.mmAdditionalRightMarketDeadline,
						com.tools20022.repository.msg.AdditionalRights2.mmAdditionalRightThreshold);
				trace_lazy = () -> AdditionalRight.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalRights2";
				definition = "Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.";
			}
		});
		return mmObject_lazy.get();
	}

	public AdditionalRightCode1Choice getAdditionalRight() {
		return additionalRight;
	}

	public AdditionalRights2 setAdditionalRight(AdditionalRightCode1Choice additionalRight) {
		this.additionalRight = Objects.requireNonNull(additionalRight);
		return this;
	}

	public Optional<Max256Text> getAdditionalRightInformationURLAddress() {
		return additionalRightInformationURLAddress == null ? Optional.empty() : Optional.of(additionalRightInformationURLAddress);
	}

	public AdditionalRights2 setAdditionalRightInformationURLAddress(Max256Text additionalRightInformationURLAddress) {
		this.additionalRightInformationURLAddress = additionalRightInformationURLAddress;
		return this;
	}

	public Optional<DateFormat29Choice> getAdditionalRightDeadline() {
		return additionalRightDeadline == null ? Optional.empty() : Optional.of(additionalRightDeadline);
	}

	public AdditionalRights2 setAdditionalRightDeadline(DateFormat29Choice additionalRightDeadline) {
		this.additionalRightDeadline = additionalRightDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getAdditionalRightMarketDeadline() {
		return additionalRightMarketDeadline == null ? Optional.empty() : Optional.of(additionalRightMarketDeadline);
	}

	public AdditionalRights2 setAdditionalRightMarketDeadline(DateFormat29Choice additionalRightMarketDeadline) {
		this.additionalRightMarketDeadline = additionalRightMarketDeadline;
		return this;
	}

	public Optional<AdditionalRightThreshold1Choice> getAdditionalRightThreshold() {
		return additionalRightThreshold == null ? Optional.empty() : Optional.of(additionalRightThreshold);
	}

	public AdditionalRights2 setAdditionalRightThreshold(AdditionalRightThreshold1Choice additionalRightThreshold) {
		this.additionalRightThreshold = additionalRightThreshold;
		return this;
	}
}