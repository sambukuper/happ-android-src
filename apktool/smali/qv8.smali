.class public final Lqv8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Class;

.field public final c:B

.field public final d:B

.field public final synthetic e:B


# direct methods
.method public constructor <init>(ILjava/lang/Class;IIB)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lqv8;->e:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p1, p0, Lqv8;->a:I

    .line 7
    .line 8
    iput-object p2, p0, Lqv8;->b:Ljava/lang/Class;

    .line 9
    .line 10
    iput-byte p3, p0, Lqv8;->d:B

    .line 11
    .line 12
    iput-byte p4, p0, Lqv8;->c:B

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljava/lang/Object;)V
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    iget-byte v1, p0, Lqv8;->e:B

    .line 4
    .line 5
    iget-byte v2, p0, Lqv8;->c:B

    .line 6
    .line 7
    if-lt v0, v2, :cond_0

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p2, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p1, p0}, Lxv8;->d(Landroid/view/View;Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_0
    check-cast p2, Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-static {p1, p2}, Lzv8;->c(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_1
    check-cast p2, Ljava/lang/CharSequence;

    .line 29
    .line 30
    invoke-static {p1, p2}, Lxv8;->e(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_2
    check-cast p2, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p1, p0}, Lxv8;->f(Landroid/view/View;Z)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    iget v4, p0, Lqv8;->a:I

    .line 48
    .line 49
    if-lt v0, v2, :cond_1

    .line 50
    .line 51
    packed-switch v1, :pswitch_data_1

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lxv8;->b(Landroid/view/View;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_1

    .line 63
    :pswitch_3
    invoke-static {p1}, Lzv8;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_1

    .line 68
    :pswitch_4
    invoke-static {p1}, Lxv8;->a(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_1

    .line 73
    :pswitch_5
    invoke-static {p1}, Lxv8;->c(Landroid/view/View;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {p1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v2, p0, Lqv8;->b:Ljava/lang/Class;

    .line 87
    .line 88
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    move-object v0, v3

    .line 96
    :goto_1
    const/4 v2, 0x0

    .line 97
    const/4 v5, 0x1

    .line 98
    packed-switch v1, :pswitch_data_2

    .line 99
    .line 100
    .line 101
    check-cast v0, Ljava/lang/Boolean;

    .line 102
    .line 103
    move-object v1, p2

    .line 104
    check-cast v1, Ljava/lang/Boolean;

    .line 105
    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    move v0, v5

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    move v0, v2

    .line 117
    :goto_2
    if-eqz v1, :cond_4

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_4

    .line 124
    .line 125
    move v1, v5

    .line 126
    goto :goto_3

    .line 127
    :cond_4
    move v1, v2

    .line 128
    :goto_3
    if-ne v0, v1, :cond_5

    .line 129
    .line 130
    :goto_4
    move v2, v5

    .line 131
    :cond_5
    xor-int/lit8 v0, v2, 0x1

    .line 132
    .line 133
    goto :goto_8

    .line 134
    :pswitch_6
    check-cast v0, Ljava/lang/CharSequence;

    .line 135
    .line 136
    move-object v1, p2

    .line 137
    check-cast v1, Ljava/lang/CharSequence;

    .line 138
    .line 139
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    :goto_5
    xor-int/2addr v0, v5

    .line 144
    goto :goto_8

    .line 145
    :pswitch_7
    check-cast v0, Ljava/lang/CharSequence;

    .line 146
    .line 147
    move-object v1, p2

    .line 148
    check-cast v1, Ljava/lang/CharSequence;

    .line 149
    .line 150
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    goto :goto_5

    .line 155
    :pswitch_8
    check-cast v0, Ljava/lang/Boolean;

    .line 156
    .line 157
    move-object v1, p2

    .line 158
    check-cast v1, Ljava/lang/Boolean;

    .line 159
    .line 160
    if-eqz v0, :cond_6

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_6

    .line 167
    .line 168
    move v0, v5

    .line 169
    goto :goto_6

    .line 170
    :cond_6
    move v0, v2

    .line 171
    :goto_6
    if-eqz v1, :cond_7

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_7

    .line 178
    .line 179
    move v1, v5

    .line 180
    goto :goto_7

    .line 181
    :cond_7
    move v1, v2

    .line 182
    :goto_7
    if-ne v0, v1, :cond_5

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :goto_8
    if-eqz v0, :cond_b

    .line 186
    .line 187
    invoke-static {p1}, Lcw8;->e(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-nez v0, :cond_8

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_8
    instance-of v1, v0, Ls3;

    .line 195
    .line 196
    if-eqz v1, :cond_9

    .line 197
    .line 198
    check-cast v0, Ls3;

    .line 199
    .line 200
    iget-object v3, v0, Ls3;->a:Lt3;

    .line 201
    .line 202
    goto :goto_9

    .line 203
    :cond_9
    new-instance v3, Lt3;

    .line 204
    .line 205
    invoke-direct {v3, v0}, Lt3;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 206
    .line 207
    .line 208
    :goto_9
    if-nez v3, :cond_a

    .line 209
    .line 210
    new-instance v3, Lt3;

    .line 211
    .line 212
    invoke-direct {v3}, Lt3;-><init>()V

    .line 213
    .line 214
    .line 215
    :cond_a
    invoke-static {p1, v3}, Lcw8;->n(Landroid/view/View;Lt3;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v4, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iget-byte p0, p0, Lqv8;->d:B

    .line 222
    .line 223
    invoke-static {p1, p0}, Lcw8;->i(Landroid/view/View;I)V

    .line 224
    .line 225
    .line 226
    :cond_b
    return-void

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
