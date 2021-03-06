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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FreightCommodityContainerShip1;
import com.tools20022.repository.msg.FreightCommodityDry1;
import com.tools20022.repository.msg.FreightCommodityWet1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity attributes of a derivative where the type is freight.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#mmDry
 * AssetClassCommodityFreight1Choice.mmDry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#mmWet
 * AssetClassCommodityFreight1Choice.mmWet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#mmContainerShip
 * AssetClassCommodityFreight1Choice.mmContainerShip}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
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
 * "AssetClassCommodityFreight1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is freight."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetClassCommodityFreight1Choice", propOrder = {"dry", "wet", "containerShip"})
public class AssetClassCommodityFreight1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dry", required = true)
	protected FreightCommodityDry1 dry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FreightCommodityDry1
	 * FreightCommodityDry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice
	 * AssetClassCommodityFreight1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dry freight commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodityFreight1Choice, FreightCommodityDry1> mmDry = new MMMessageAssociationEnd<AssetClassCommodityFreight1Choice, FreightCommodityDry1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.mmObject();
			isDerived = false;
			xmlTag = "Dry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dry";
			definition = "Dry freight commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FreightCommodityDry1.mmObject();
		}

		@Override
		public FreightCommodityDry1 getValue(AssetClassCommodityFreight1Choice obj) {
			return obj.getDry();
		}

		@Override
		public void setValue(AssetClassCommodityFreight1Choice obj, FreightCommodityDry1 value) {
			obj.setDry(value);
		}
	};
	@XmlElement(name = "Wet", required = true)
	protected FreightCommodityWet1 wet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FreightCommodityWet1
	 * FreightCommodityWet1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice
	 * AssetClassCommodityFreight1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wet freight commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodityFreight1Choice, FreightCommodityWet1> mmWet = new MMMessageAssociationEnd<AssetClassCommodityFreight1Choice, FreightCommodityWet1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.mmObject();
			isDerived = false;
			xmlTag = "Wet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wet";
			definition = "Wet freight commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FreightCommodityWet1.mmObject();
		}

		@Override
		public FreightCommodityWet1 getValue(AssetClassCommodityFreight1Choice obj) {
			return obj.getWet();
		}

		@Override
		public void setValue(AssetClassCommodityFreight1Choice obj, FreightCommodityWet1 value) {
			obj.setWet(value);
		}
	};
	@XmlElement(name = "CntnrShip", required = true)
	protected FreightCommodityContainerShip1 containerShip;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityContainerShip1
	 * FreightCommodityContainerShip1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice
	 * AssetClassCommodityFreight1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntnrShip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContainerShip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Container ship freight commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodityFreight1Choice, FreightCommodityContainerShip1> mmContainerShip = new MMMessageAssociationEnd<AssetClassCommodityFreight1Choice, FreightCommodityContainerShip1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.mmObject();
			isDerived = false;
			xmlTag = "CntnrShip";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContainerShip";
			definition = "Container ship freight commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FreightCommodityContainerShip1.mmObject();
		}

		@Override
		public FreightCommodityContainerShip1 getValue(AssetClassCommodityFreight1Choice obj) {
			return obj.getContainerShip();
		}

		@Override
		public void setValue(AssetClassCommodityFreight1Choice obj, FreightCommodityContainerShip1 value) {
			obj.setContainerShip(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.mmDry, com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.mmWet,
						com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.mmContainerShip);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityFreight1Choice";
				definition = "Defines commodity attributes of a derivative where the type is freight.";
			}
		});
		return mmObject_lazy.get();
	}

	public FreightCommodityDry1 getDry() {
		return dry;
	}

	public AssetClassCommodityFreight1Choice setDry(FreightCommodityDry1 dry) {
		this.dry = Objects.requireNonNull(dry);
		return this;
	}

	public FreightCommodityWet1 getWet() {
		return wet;
	}

	public AssetClassCommodityFreight1Choice setWet(FreightCommodityWet1 wet) {
		this.wet = Objects.requireNonNull(wet);
		return this;
	}

	public FreightCommodityContainerShip1 getContainerShip() {
		return containerShip;
	}

	public AssetClassCommodityFreight1Choice setContainerShip(FreightCommodityContainerShip1 containerShip) {
		this.containerShip = Objects.requireNonNull(containerShip);
		return this;
	}
}