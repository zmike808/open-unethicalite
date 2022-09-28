import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("c")
	@Export("name")
	String name;
	@ObfuscatedName("p")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpn;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			label138: {
				int var5 = 0;

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) {
					var8 = var1.charAt(var5);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}
				}

				while (var6 > var5) {
					var8 = var1.charAt(var6 - 1);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}

					--var6;
				}

				int var17 = var6 - var5;
				if (var17 >= 1) {
					byte var9;
					if (var2 == null) {
						var9 = 12;
					} else {
						switch(var2.field4642) {
						case 7:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var17 <= var9) {
						StringBuilder var15 = new StringBuilder(var17);

						for (int var18 = var5; var18 < var6; ++var18) {
							char var10 = var1.charAt(var18);
							boolean var11;
							if (Character.isISOControl(var10)) {
								var11 = false;
							} else if (PlayerCompositionColorTextureOverride.isAlphaNumeric(var10)) {
								var11 = true;
							} else {
								char[] var12 = class425.field4655;
								int var13 = 0;

								label91:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class425.field4659;

										for (var13 = 0; var13 < var12.length; ++var13) {
											var14 = var12[var13];
											if (var10 == var14) {
												var11 = true;
												break label91;
											}
										}

										var11 = false;
										break;
									}

									var14 = var12[var13];
									if (var14 == var10) {
										var11 = true;
										break;
									}

									++var13;
								}
							}

							if (var11) {
								char var16 = GrandExchangeOfferAgeComparator.method6156(var10);
								if (var16 != 0) {
									var15.append(var16);
								}
							}
						}

						if (var15.length() == 0) {
							var4 = null;
						} else {
							var4 = var15.toString();
						}
						break label138;
					}
				}

				var4 = null;
			}
		}

		this.cleanName = var4;
	}

	public Username(String var1) {
		this.name = var1;
		LoginType var4 = LoginType.oldscape;
		String var3;
		if (var1 == null) {
			var3 = null;
		} else {
			label136: {
				int var5 = 0;

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) {
					var8 = var1.charAt(var5);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}
				}

				while (var6 > var5) {
					var8 = var1.charAt(var6 - 1);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}

					--var6;
				}

				int var17 = var6 - var5;
				if (var17 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field4642) {
						case 7:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var17 <= var9) {
						StringBuilder var15 = new StringBuilder(var17);

						for (int var18 = var5; var18 < var6; ++var18) {
							char var10 = var1.charAt(var18);
							boolean var11;
							if (Character.isISOControl(var10)) {
								var11 = false;
							} else if (PlayerCompositionColorTextureOverride.isAlphaNumeric(var10)) {
								var11 = true;
							} else {
								char[] var12 = class425.field4655;
								int var13 = 0;

								label89:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class425.field4659;

										for (var13 = 0; var13 < var12.length; ++var13) {
											var14 = var12[var13];
											if (var14 == var10) {
												var11 = true;
												break label89;
											}
										}

										var11 = false;
										break;
									}

									var14 = var12[var13];
									if (var10 == var14) {
										var11 = true;
										break;
									}

									++var13;
								}
							}

							if (var11) {
								char var16 = GrandExchangeOfferAgeComparator.method6156(var10);
								if (var16 != 0) {
									var15.append(var16);
								}
							}
						}

						if (var15.length() == 0) {
							var3 = null;
						} else {
							var3 = var15.toString();
						}
						break label136;
					}
				}

				var3 = null;
			}
		}

		this.cleanName = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2060656858"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1292087899"
	)
	public String method8530() {
		return this.cleanName;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2041641419"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqo;I)I",
		garbageValue = "-502687717"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) {
			return var1.cleanName == null ? 0 : 1;
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) {
			Username var2 = (Username)var1;
			if (this.cleanName == null) {
				return var2.cleanName == null;
			} else if (var2.cleanName == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode();
	}

	public String toString() {
		return this.getName();
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}
}
