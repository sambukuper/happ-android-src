.class public final Lgk7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;

.field public final c:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr47;

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lgk7;->a:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lr47;

    .line 19
    .line 20
    const/16 v1, 0x16

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lvz7;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lgk7;->b:Lvz7;

    .line 31
    .line 32
    new-instance v0, Lr47;

    .line 33
    .line 34
    const/16 v1, 0x17

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lvz7;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lgk7;->c:Lvz7;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a(Lsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lgk7;->a:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lbk7;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lbk7;->b:Lvz7;

    .line 13
    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    iget-object v2, v0, Lbk7;->c:Lvz7;

    .line 17
    .line 18
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lzt7;

    .line 23
    .line 24
    new-instance v3, Lgq6;

    .line 25
    .line 26
    const/4 v4, 0x5

    .line 27
    invoke-direct {v3, p1, p3, v4}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p3, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lmn6;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p3}, Lmn6;->q(Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;->e()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v3, 0x1

    .line 53
    if-ne v2, v3, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->F0()Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lmn6;

    .line 71
    .line 72
    invoke-virtual {v1, p3, v2}, Lmn6;->F(Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->r0()Lsu/happ/proxyutility/dto/enums/EIpType;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Lbk7;->a()Lcom/tencent/mmkv/MMKV;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const-string v3, "pref_ip_type"

    .line 86
    .line 87
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/enums/EIpType;->c()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v2, v3, v1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    :cond_2
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->H0()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-eqz v1, :cond_3

    .line 99
    .line 100
    invoke-virtual {v0}, Lbk7;->a()Lcom/tencent/mmkv/MMKV;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const-string v3, "pref_socks_auth_mode"

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-virtual {v2, v1, v3}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->J0()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-eqz v1, :cond_4

    .line 118
    .line 119
    invoke-virtual {v0}, Lbk7;->a()Lcom/tencent/mmkv/MMKV;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    const-string v3, "pref_socks_auth_manual_user"

    .line 124
    .line 125
    invoke-virtual {v2, v3, v1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    :cond_4
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->I0()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    invoke-virtual {v0}, Lbk7;->a()Lcom/tencent/mmkv/MMKV;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const-string v3, "pref_socks_auth_manual_pass"

    .line 139
    .line 140
    invoke-virtual {v2, v3, v1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    :cond_5
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->Q()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    invoke-virtual {v0}, Lbk7;->a()Lcom/tencent/mmkv/MMKV;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const-string v3, "pref_http_auth_mode"

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-virtual {v2, v1, v3}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_6
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->S()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    if-eqz v1, :cond_7

    .line 167
    .line 168
    invoke-virtual {v0}, Lbk7;->a()Lcom/tencent/mmkv/MMKV;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const-string v3, "pref_http_auth_manual_user"

    .line 173
    .line 174
    invoke-virtual {v2, v3, v1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    :cond_7
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->R()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    if-eqz v1, :cond_8

    .line 182
    .line 183
    invoke-virtual {v0}, Lbk7;->a()Lcom/tencent/mmkv/MMKV;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const-string v3, "pref_http_auth_manual_pass"

    .line 188
    .line 189
    invoke-virtual {v2, v3, v1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    :cond_8
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->e1()Ljava/lang/Boolean;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    if-eqz v1, :cond_9

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    invoke-virtual {v0}, Lbk7;->a()Lcom/tencent/mmkv/MMKV;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const-string v2, "pref_use_legacy_okhttp"

    .line 207
    .line 208
    invoke-virtual {v0, v2, v1}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 209
    .line 210
    .line 211
    :cond_9
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 212
    .line 213
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v1, Las;

    .line 222
    .line 223
    const/16 v2, 0xd

    .line 224
    .line 225
    invoke-direct {v1, v2, p2}, Las;-><init>(BZ)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 229
    .line 230
    .line 231
    if-eqz p2, :cond_a

    .line 232
    .line 233
    iget-object p0, p0, Lgk7;->b:Lvz7;

    .line 234
    .line 235
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    check-cast p0, Lek7;

    .line 240
    .line 241
    invoke-virtual {p0, p3, p1, p4}, Lek7;->c(Ljava/lang/String;Lsu/happ/proxyutility/dto/MetaParams;Ls51;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    sget-object p1, Lc71;->X:Lc71;

    .line 246
    .line 247
    if-ne p0, p1, :cond_a

    .line 248
    .line 249
    return-object p0

    .line 250
    :cond_a
    sget-object p0, Ldn8;->a:Ldn8;

    .line 251
    .line 252
    return-object p0
.end method
