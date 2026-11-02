.class public final synthetic Lsl;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput-byte p1, p0, Lsl;->X:B

    iput-object p3, p0, Lsl;->Z:Ljava/lang/Object;

    iput-object p4, p0, Lsl;->f0:Ljava/lang/Object;

    iput p2, p0, Lsl;->Y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltn2;ILmw2;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput-byte v0, p0, Lsl;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsl;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lsl;->Y:I

    .line 10
    .line 11
    iput-object p3, p0, Lsl;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lsl;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget v3, p0, Lsl;->Y:I

    .line 7
    .line 8
    iget-object v4, p0, Lsl;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Lsl;->Z:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lce8;

    .line 16
    .line 17
    check-cast p1, Llp2;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    or-int/lit8 p2, v3, 0x1

    .line 25
    .line 26
    invoke-static {p2}, Lw79;->P(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {p0, v4, p1, p2}, Lce8;->a(Ljava/lang/Object;Llp2;I)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    check-cast p0, Lum6;

    .line 35
    .line 36
    check-cast v4, Lkx4;

    .line 37
    .line 38
    check-cast p1, Llp2;

    .line 39
    .line 40
    check-cast p2, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    or-int/lit8 p2, v3, 0x1

    .line 46
    .line 47
    invoke-static {p2}, Lw79;->P(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-static {p0, v4, p1, p2}, Lu70;->m(Lum6;Lkx4;Llp2;I)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_1
    check-cast p0, Lga3;

    .line 56
    .line 57
    check-cast v4, Lkx4;

    .line 58
    .line 59
    check-cast p1, Llp2;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    or-int/lit8 p2, v3, 0x1

    .line 67
    .line 68
    invoke-static {p2}, Lw79;->P(I)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {p0, v4, p1, p2}, Lys0;->b(Lga3;Lkx4;Llp2;I)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_2
    check-cast p0, Lmw2;

    .line 77
    .line 78
    check-cast v4, Lkx4;

    .line 79
    .line 80
    check-cast p1, Llp2;

    .line 81
    .line 82
    check-cast p2, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    or-int/lit8 p2, v3, 0x1

    .line 88
    .line 89
    invoke-static {p2}, Lw79;->P(I)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-static {p0, v4, p1, p2}, Ljm4;->a(Lmw2;Lkx4;Llp2;I)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :pswitch_3
    check-cast p0, Ltn2;

    .line 98
    .line 99
    check-cast v4, Lmw2;

    .line 100
    .line 101
    check-cast p1, Llp2;

    .line 102
    .line 103
    check-cast p2, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    and-int/lit8 v0, p2, 0x3

    .line 110
    .line 111
    const/4 v5, 0x2

    .line 112
    const/4 v6, 0x0

    .line 113
    if-eq v0, v5, :cond_0

    .line 114
    .line 115
    move v0, v2

    .line 116
    goto :goto_0

    .line 117
    :cond_0
    move v0, v6

    .line 118
    :goto_0
    and-int/2addr p2, v2

    .line 119
    invoke-virtual {p1, p2, v0}, Llp2;->N(IZ)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_1

    .line 124
    .line 125
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-interface {p0, p2, v4, p1, v0}, Ltn2;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    invoke-virtual {p1}, Llp2;->Q()V

    .line 138
    .line 139
    .line 140
    :goto_1
    return-object v1

    .line 141
    :pswitch_4
    check-cast p0, Lir2;

    .line 142
    .line 143
    check-cast v4, Lkx4;

    .line 144
    .line 145
    check-cast p1, Llp2;

    .line 146
    .line 147
    check-cast p2, Ljava/lang/Integer;

    .line 148
    .line 149
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    or-int/lit8 p2, v3, 0x1

    .line 153
    .line 154
    invoke-static {p2}, Lw79;->P(I)I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    invoke-static {p0, v4, p1, p2}, Lgr2;->b(Lir2;Lkx4;Llp2;I)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    :pswitch_5
    check-cast p0, [Lt06;

    .line 163
    .line 164
    check-cast v4, Lrn2;

    .line 165
    .line 166
    check-cast p1, Llp2;

    .line 167
    .line 168
    check-cast p2, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    or-int/lit8 p2, v3, 0x1

    .line 174
    .line 175
    invoke-static {p2}, Lw79;->P(I)I

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    invoke-static {p0, v4, p1, p2}, Lmb6;->b([Lt06;Lrn2;Llp2;I)V

    .line 180
    .line 181
    .line 182
    return-object v1

    .line 183
    :pswitch_6
    check-cast p0, Lt06;

    .line 184
    .line 185
    check-cast v4, Lrn2;

    .line 186
    .line 187
    check-cast p1, Llp2;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/Integer;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    or-int/lit8 p2, v3, 0x1

    .line 195
    .line 196
    invoke-static {p2}, Lw79;->P(I)I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    invoke-static {p0, v4, p1, p2}, Lmb6;->a(Lt06;Lrn2;Llp2;I)V

    .line 201
    .line 202
    .line 203
    return-object v1

    .line 204
    :pswitch_7
    check-cast p0, Lzy0;

    .line 205
    .line 206
    check-cast p1, Llp2;

    .line 207
    .line 208
    check-cast p2, Ljava/lang/Integer;

    .line 209
    .line 210
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-static {v3}, Lw79;->P(I)I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    or-int/2addr p2, v2

    .line 218
    invoke-virtual {p0, v4, p1, p2}, Lzy0;->f(Ljava/lang/Object;Llp2;I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    return-object v1

    .line 222
    :pswitch_8
    check-cast p0, Lql;

    .line 223
    .line 224
    check-cast v4, Ljava/util/List;

    .line 225
    .line 226
    check-cast p1, Llp2;

    .line 227
    .line 228
    check-cast p2, Ljava/lang/Integer;

    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    or-int/lit8 p2, v3, 0x1

    .line 234
    .line 235
    invoke-static {p2}, Lw79;->P(I)I

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    invoke-static {p0, v4, p1, p2}, Ltl;->a(Lql;Ljava/util/List;Llp2;I)V

    .line 240
    .line 241
    .line 242
    return-object v1

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
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
