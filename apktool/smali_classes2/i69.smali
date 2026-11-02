.class public final synthetic Li69;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Li69;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte p0, p0, Li69;->X:B

    .line 2
    .line 3
    const/16 v0, 0x2d

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, Lj$/time/format/DateTimeFormatterBuilder;

    .line 11
    .line 12
    invoke-direct {p0}, Lj$/time/format/DateTimeFormatterBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lj$/time/format/DateTimeFormatterBuilder;->parseCaseInsensitive()Lj$/time/format/DateTimeFormatterBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v2, Lj$/time/temporal/ChronoField;->YEAR:Lj$/time/temporal/ChronoField;

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    sget-object v4, Lj$/time/format/SignStyle;->EXCEEDS_PAD:Lj$/time/format/SignStyle;

    .line 23
    .line 24
    invoke-virtual {p0, v2, v3, v1, v4}, Lj$/time/format/DateTimeFormatterBuilder;->appendValue(Lj$/time/temporal/TemporalField;IILj$/time/format/SignStyle;)Lj$/time/format/DateTimeFormatterBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, v0}, Lj$/time/format/DateTimeFormatterBuilder;->appendLiteral(C)Lj$/time/format/DateTimeFormatterBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object v0, Lj$/time/temporal/ChronoField;->MONTH_OF_YEAR:Lj$/time/temporal/ChronoField;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    invoke-virtual {p0, v0, v1}, Lj$/time/format/DateTimeFormatterBuilder;->appendValue(Lj$/time/temporal/TemporalField;I)Lj$/time/format/DateTimeFormatterBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lj$/time/format/DateTimeFormatterBuilder;->toFormatter()Lj$/time/format/DateTimeFormatter;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_0
    new-instance p0, Lb79;

    .line 45
    .line 46
    new-instance v1, Lps;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v1, v2}, Lps;-><init>(B)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v1}, Lb79;-><init>(Lps;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Lbc1;->j(Lbc1;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v0}, Lz68;->t(Lcc1;C)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Lbc1;->m(Lbc1;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lc79;

    .line 65
    .line 66
    invoke-interface {p0}, Lh1;->build()Lsc0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {v0, p0}, Lc79;-><init>(Lsc0;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_1
    sget p0, Lsu/happ/proxyutility/service/XRayVpnService;->v0:I

    .line 75
    .line 76
    new-instance p0, Landroid/net/NetworkRequest$Builder;

    .line 77
    .line 78
    invoke-direct {p0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 79
    .line 80
    .line 81
    const/16 v0, 0xc

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const/16 v0, 0xd

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_2
    sget p0, Lsu/happ/proxyutility/service/XRayVpnService;->v0:I

    .line 99
    .line 100
    new-instance p0, Lsu/happ/proxyutility/service/XRayServiceManager$VpnMessageReceiver;

    .line 101
    .line 102
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 103
    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_3
    sget p0, Lsu/happ/proxyutility/service/XRayVpnService;->v0:I

    .line 107
    .line 108
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 109
    .line 110
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :pswitch_4
    sget p0, Lsu/happ/proxyutility/service/XRayVpnService;->v0:I

    .line 120
    .line 121
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 122
    .line 123
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->s0:Lvz7;

    .line 128
    .line 129
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lu42;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_5
    sget p0, Lsu/happ/proxyutility/service/XRayVpnService;->v0:I

    .line 137
    .line 138
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 139
    .line 140
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :pswitch_6
    sget p0, Lsu/happ/proxyutility/service/XRayVpnService;->v0:I

    .line 150
    .line 151
    sget-object p0, Lkw4;->a:Lkw4;

    .line 152
    .line 153
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :pswitch_7
    sget-object p0, Lsu/happ/proxyutility/service/XRayTestService;->X:Lvz7;

    .line 159
    .line 160
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v0, Lt52;

    .line 168
    .line 169
    invoke-direct {v0, p0}, Lt52;-><init>(Ljava/util/concurrent/Executor;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_8
    sget-object p0, Lsu/happ/proxyutility/service/XRayTestService;->X:Lvz7;

    .line 178
    .line 179
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v0, Lt52;

    .line 187
    .line 188
    invoke-direct {v0, p0}, Lt52;-><init>(Ljava/util/concurrent/Executor;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    return-object p0

    .line 196
    :pswitch_9
    sget-object p0, Lsu/happ/proxyutility/service/XRayTestService;->X:Lvz7;

    .line 197
    .line 198
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    new-instance v0, Lt52;

    .line 206
    .line 207
    invoke-direct {v0, p0}, Lt52;-><init>(Ljava/util/concurrent/Executor;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    return-object p0

    .line 215
    :pswitch_a
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 216
    .line 217
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_b
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 227
    .line 228
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    return-object p0

    .line 237
    :pswitch_c
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 238
    .line 239
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->b()Lk61;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    return-object p0

    .line 248
    :pswitch_d
    const-string p0, "SETTING"

    .line 249
    .line 250
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
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
