.class public final synthetic Lyc;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:J

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLkx4;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput-byte v0, p0, Lyc;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lyc;->Y:J

    iput-object p3, p0, Lyc;->Z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(JLrn2;I)V
    .locals 0

    .line 1
    const/4 p4, 0x1

    .line 2
    iput-byte p4, p0, Lyc;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lyc;->Y:J

    .line 8
    .line 9
    iput-object p3, p0, Lyc;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lyc;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lyc;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    iget-wide v4, p0, Lyc;->Y:J

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v3, Lrn2;

    .line 14
    .line 15
    check-cast p1, Llp2;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lw79;->P(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {v4, v5, v3, p1, p0}, Lpn7;->c(JLrn2;Llp2;I)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    move-object v6, v3

    .line 31
    check-cast v6, Lkx4;

    .line 32
    .line 33
    check-cast p1, Llp2;

    .line 34
    .line 35
    check-cast p2, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    and-int/lit8 p2, p0, 0x3

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    const/4 v3, 0x0

    .line 45
    if-eq p2, v0, :cond_0

    .line 46
    .line 47
    move p2, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move p2, v3

    .line 50
    :goto_0
    and-int/2addr p0, v2

    .line 51
    invoke-virtual {p1, p0, p2}, Llp2;->N(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    cmp-long p0, v4, v7

    .line 63
    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    const p0, -0x4a262578

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Llp2;->W(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v4, v5}, Lnt1;->b(J)F

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-static {v4, v5}, Lnt1;->a(J)F

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    const/4 v10, 0x0

    .line 81
    const/16 v11, 0xc

    .line 82
    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/b;->f(Lkx4;FFFFI)Lkx4;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object p2, Lpz2;->f0:Lp50;

    .line 89
    .line 90
    invoke-static {p2, v3}, Lg80;->c(Lp50;Z)Lxr4;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iget-wide v4, p1, Llp2;->T:J

    .line 95
    .line 96
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {p1}, Llp2;->l()Lkl5;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-static {p1, p0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    sget-object v5, Luz0;->j:Lpz2;

    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Llp2;->Z()V

    .line 114
    .line 115
    .line 116
    iget-boolean v5, p1, Llp2;->S:Z

    .line 117
    .line 118
    if-eqz v5, :cond_1

    .line 119
    .line 120
    invoke-virtual {p1}, Llp2;->k()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    invoke-virtual {p1}, Llp2;->j0()V

    .line 125
    .line 126
    .line 127
    :goto_1
    sget-object v5, Lpz2;->B0:Ldx0;

    .line 128
    .line 129
    invoke-static {v5, p1, p2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object p2, Lpz2;->A0:Ldx0;

    .line 133
    .line 134
    invoke-static {p2, p1, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    sget-object v0, Lpz2;->C0:Ldx0;

    .line 142
    .line 143
    invoke-static {v0, p1, p2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-static {p1}, Lpn7;->l(Llp2;)V

    .line 147
    .line 148
    .line 149
    sget-object p2, Lpz2;->z0:Ldx0;

    .line 150
    .line 151
    invoke-static {p2, p1, p0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    const/4 p0, 0x0

    .line 155
    invoke-static {p0, p1, v3, v2}, Ldd;->b(Lkx4;Llp2;II)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v2}, Llp2;->p(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v3}, Llp2;->p(Z)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_2
    const p0, -0x4a2083ba

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p0}, Llp2;->W(I)V

    .line 169
    .line 170
    .line 171
    invoke-static {v6, p1, v3, v3}, Ldd;->b(Lkx4;Llp2;II)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v3}, Llp2;->p(Z)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_3
    invoke-virtual {p1}, Llp2;->Q()V

    .line 179
    .line 180
    .line 181
    :goto_2
    return-object v1

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
