.class public final synthetic Ltv2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 9
    iput-byte p1, p0, Ltv2;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p1, 0xd

    .line 2
    .line 3
    iput-byte p1, p0, Ltv2;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte p0, p0, Ltv2;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, Lkt1;

    .line 8
    .line 9
    const/high16 v0, 0x42400000    # 48.0f

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lkt1;-><init>(F)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    return-object v0

    .line 16
    :pswitch_1
    sget-object p0, Lqb3;->a:Lox1;

    .line 17
    .line 18
    sget-object p0, Lje1;->a:Lje1;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_2
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 22
    .line 23
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->I0:Lvz7;

    .line 28
    .line 29
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lms;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_3
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 37
    .line 38
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_4
    sget-object p0, Lkw4;->a:Lkw4;

    .line 48
    .line 49
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_5
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 55
    .line 56
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->i()Lig8;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_6
    new-instance p0, Lh83;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_7
    new-instance p0, Lf83;

    .line 72
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_8
    sget-object p0, Lys8;->a:Lvz7;

    .line 78
    .line 79
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Lr76;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_9
    sget-object p0, Ltp1;->a:Lnf1;

    .line 87
    .line 88
    sget-object p0, Ldm4;->a:Lhv2;

    .line 89
    .line 90
    iget-object p0, p0, Lhv2;->h0:Lhv2;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_a
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string v0, "CompositionLocal LocalHostDefaultProvider not present"

    .line 96
    .line 97
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :pswitch_b
    sget-object p0, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;->o0:Lvz7;

    .line 102
    .line 103
    sget-object p0, Lkw4;->a:Lkw4;

    .line 104
    .line 105
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :pswitch_c
    new-instance p0, Lky2;

    .line 111
    .line 112
    invoke-direct {p0}, Lky2;-><init>()V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_d
    throw v0

    .line 117
    :pswitch_e
    new-instance p0, Lpx2;

    .line 118
    .line 119
    invoke-direct {p0}, Lpx2;-><init>()V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_f
    sget-object p0, Ldn8;->a:Ldn8;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_10
    new-instance p0, Low2;

    .line 127
    .line 128
    const/4 v0, 0x0

    .line 129
    invoke-direct {p0, v0}, Low2;-><init>(Z)V

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_11
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 134
    .line 135
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :pswitch_12
    const-string p0, "SETTING"

    .line 145
    .line 146
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0

    .line 155
    :pswitch_13
    const-string p0, "SERVER_RAW"

    .line 156
    .line 157
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    :pswitch_14
    const-string p0, "MAIN"

    .line 167
    .line 168
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_15
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 178
    .line 179
    new-instance p0, Lig8;

    .line 180
    .line 181
    invoke-direct {p0}, Lig8;-><init>()V

    .line 182
    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_16
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 186
    .line 187
    new-instance p0, Lu42;

    .line 188
    .line 189
    invoke-direct {p0}, Lu42;-><init>()V

    .line 190
    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_17
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 194
    .line 195
    new-instance p0, Lpv0;

    .line 196
    .line 197
    invoke-direct {p0}, Lpv0;-><init>()V

    .line 198
    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_18
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 202
    .line 203
    new-instance p0, Lxr7;

    .line 204
    .line 205
    invoke-direct {p0}, Lxr7;-><init>()V

    .line 206
    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_19
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 210
    .line 211
    new-instance p0, Lxj7;

    .line 212
    .line 213
    invoke-direct {p0}, Lxj7;-><init>()V

    .line 214
    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_1a
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 218
    .line 219
    new-instance p0, Len7;

    .line 220
    .line 221
    invoke-direct {p0}, Len7;-><init>()V

    .line 222
    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_1b
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 226
    .line 227
    new-instance p0, Ls24;

    .line 228
    .line 229
    invoke-direct {p0}, Ls24;-><init>()V

    .line 230
    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_1c
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 234
    .line 235
    new-instance p0, Lqq0;

    .line 236
    .line 237
    invoke-direct {p0}, Lqq0;-><init>()V

    .line 238
    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
