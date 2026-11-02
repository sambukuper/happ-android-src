.class public final synthetic Lrb7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lwb7;


# direct methods
.method public synthetic constructor <init>(Lwb7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lrb7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrb7;->Y:Lwb7;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lrb7;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    iget-object p0, p0, Lrb7;->Y:Lwb7;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lz85;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Lwb7;->a(F)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lwb7;->p0:Lhr5;

    .line 18
    .line 19
    invoke-virtual {p0}, Lhr5;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object v0, p0, Lwb7;->Y:Luu0;

    .line 30
    .line 31
    iget-object v2, p0, Lwb7;->Z:Lnh5;

    .line 32
    .line 33
    iget v3, v0, Luu0;->X:F

    .line 34
    .line 35
    iget v4, v0, Luu0;->Y:F

    .line 36
    .line 37
    invoke-static {p1, v3, v4}, Lx97;->m(FFF)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget-byte v3, p0, Lwb7;->X:B

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    if-lez v3, :cond_2

    .line 45
    .line 46
    add-int/2addr v3, v5

    .line 47
    if-ltz v3, :cond_2

    .line 48
    .line 49
    move v7, p1

    .line 50
    move v8, v7

    .line 51
    move v6, v1

    .line 52
    :goto_0
    iget v9, v0, Luu0;->X:F

    .line 53
    .line 54
    int-to-float v10, v6

    .line 55
    int-to-float v11, v3

    .line 56
    div-float/2addr v10, v11

    .line 57
    invoke-static {v9, v4, v10}, Lw51;->H(FFF)F

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    sub-float v10, v9, p1

    .line 62
    .line 63
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    cmpg-float v11, v11, v7

    .line 68
    .line 69
    if-gtz v11, :cond_0

    .line 70
    .line 71
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    move v8, v9

    .line 76
    :cond_0
    if-eq v6, v3, :cond_1

    .line 77
    .line 78
    add-int/lit8 v6, v6, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move p1, v8

    .line 82
    :cond_2
    invoke-virtual {v2}, Lnh5;->l()F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    cmpg-float v0, p1, v0

    .line 87
    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-virtual {v2}, Lnh5;->l()F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    cmpg-float v0, p1, v0

    .line 96
    .line 97
    if-nez v0, :cond_4

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    iget-object v0, p0, Lwb7;->f0:Lgn2;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-interface {v0, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    invoke-virtual {p0, p1}, Lwb7;->c(F)V

    .line 113
    .line 114
    .line 115
    :goto_1
    move v1, v5

    .line 116
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :pswitch_1
    check-cast p1, Lf17;

    .line 122
    .line 123
    iget-object v0, p0, Lwb7;->Z:Lnh5;

    .line 124
    .line 125
    invoke-virtual {v0}, Lnh5;->l()F

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const/high16 v3, 0x42c80000    # 100.0f

    .line 130
    .line 131
    mul-float/2addr v0, v3

    .line 132
    invoke-static {v0}, Lnr4;->O(F)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    int-to-float v0, v0

    .line 137
    div-float/2addr v0, v3

    .line 138
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sget-object v3, Ld17;->a:[Lnw3;

    .line 143
    .line 144
    sget-object v3, Lc17;->b:Le17;

    .line 145
    .line 146
    sget-object v4, Ld17;->a:[Lnw3;

    .line 147
    .line 148
    aget-object v1, v4, v1

    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-interface {p1, v3, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    new-instance v0, Lrb7;

    .line 157
    .line 158
    const/4 v1, 0x2

    .line 159
    invoke-direct {v0, p0, v1}, Lrb7;-><init>(Lwb7;B)V

    .line 160
    .line 161
    .line 162
    sget-object p0, Ls07;->i:Le17;

    .line 163
    .line 164
    new-instance v1, Lq3;

    .line 165
    .line 166
    const/4 v3, 0x0

    .line 167
    invoke-direct {v1, v3, v0}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {p1, p0, v1}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    return-object v2

    .line 174
    :pswitch_2
    check-cast p1, Lpf3;

    .line 175
    .line 176
    iget-wide v0, p1, Lpf3;->a:J

    .line 177
    .line 178
    const/16 v3, 0x20

    .line 179
    .line 180
    shr-long/2addr v0, v3

    .line 181
    long-to-int v0, v0

    .line 182
    iget-object v1, p0, Lwb7;->l0:Loh5;

    .line 183
    .line 184
    invoke-virtual {v1, v0}, Loh5;->m(I)V

    .line 185
    .line 186
    .line 187
    iget-wide v0, p1, Lpf3;->a:J

    .line 188
    .line 189
    const-wide v3, 0xffffffffL

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    and-long/2addr v0, v3

    .line 195
    long-to-int p1, v0

    .line 196
    iget-object p0, p0, Lwb7;->m0:Loh5;

    .line 197
    .line 198
    invoke-virtual {p0, p1}, Loh5;->m(I)V

    .line 199
    .line 200
    .line 201
    return-object v2

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
