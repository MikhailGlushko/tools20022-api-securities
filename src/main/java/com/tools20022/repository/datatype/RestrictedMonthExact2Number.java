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

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMQuantity;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RestrictedMonthExact2Number.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Two digit restricted list for use representing calendar months.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMDecimal#getPattern pattern} =
 * "[0-9]{2,2}"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMDecimal#getMinInclusive
 * minInclusive} = "1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMDecimal#getMaxInclusive
 * maxInclusive} = "12"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"01"</li>
 * <li>"04"</li>
 * <li>"12"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RestrictedMonthExact2Number"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Two digit restricted list for use representing calendar months."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RestrictedMonthExact2Number {

	final static private AtomicReference<MMQuantity> mmObject_lazy = new AtomicReference<>();
	protected BigDecimal value;

	final static public MMQuantity mmObject() {
		mmObject_lazy.compareAndSet(null, new MMQuantity() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("01", "04", "12");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RestrictedMonthExact2Number";
				definition = "Two digit restricted list for use representing calendar months.";
				pattern = "[0-9]{2,2}";
				minInclusive = "1";
				maxInclusive = "12";
				totalDigits = 2;
				fractionDigits = 0;
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedMonthExact2Number(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal toBigDecimal() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<BigDecimal, RestrictedMonthExact2Number> {
		@Override
		public RestrictedMonthExact2Number unmarshal(BigDecimal value) {
			return new RestrictedMonthExact2Number(value);
		}

		@Override
		public BigDecimal marshal(RestrictedMonthExact2Number typedData) {
			return typedData.value;
		}
	}
}