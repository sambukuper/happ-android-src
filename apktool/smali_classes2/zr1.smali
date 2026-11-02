.class public final Lzr1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public final synthetic h0:J

.field public final synthetic i0:Ljava/lang/String;

.field public final synthetic j0:Lbr1;

.field public final synthetic k0:S

.field public final synthetic l0:Lgn2;

.field public final synthetic m0:Ljava/lang/String;

.field public final synthetic n0:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lbr1;JLgn2;Ljava/lang/String;Ljava/util/LinkedHashMap;Lq51;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lzr1;->h0:J

    .line 2
    .line 3
    iput-object p3, p0, Lzr1;->i0:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Lzr1;->j0:Lbr1;

    .line 6
    .line 7
    long-to-int p1, p5

    .line 8
    iput-short p1, p0, Lzr1;->k0:S

    .line 9
    .line 10
    iput-object p7, p0, Lzr1;->l0:Lgn2;

    .line 11
    .line 12
    iput-object p8, p0, Lzr1;->m0:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p9, p0, Lzr1;->n0:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p10}, Luy7;-><init>(ILq51;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lzr1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lzr1;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lzr1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 11

    .line 1
    new-instance v0, Lzr1;

    .line 2
    .line 3
    iget-short p2, p0, Lzr1;->k0:S

    .line 4
    .line 5
    int-to-long v5, p2

    .line 6
    iget-object v8, p0, Lzr1;->m0:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v9, p0, Lzr1;->n0:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    iget-wide v1, p0, Lzr1;->h0:J

    .line 11
    .line 12
    iget-object v3, p0, Lzr1;->i0:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v4, p0, Lzr1;->j0:Lbr1;

    .line 15
    .line 16
    iget-object v7, p0, Lzr1;->l0:Lgn2;

    .line 17
    .line 18
    move-object v10, p1

    .line 19
    invoke-direct/range {v0 .. v10}, Lzr1;-><init>(JLjava/lang/String;Lbr1;JLgn2;Ljava/lang/String;Ljava/util/LinkedHashMap;Lq51;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lzr1;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    sget-object v4, Lc71;->X:Lc71;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v3, :cond_1

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object v11, p0

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const-wide/16 v5, 0x0

    .line 33
    .line 34
    iget-wide v7, p0, Lzr1;->h0:J

    .line 35
    .line 36
    cmp-long p1, v7, v5

    .line 37
    .line 38
    if-lez p1, :cond_3

    .line 39
    .line 40
    iput-byte v3, p0, Lzr1;->g0:B

    .line 41
    .line 42
    invoke-static {v7, v8, p0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v4, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_0
    sget-object v5, Lbs1;->a:Lbs1;

    .line 50
    .line 51
    iget-short p1, p0, Lzr1;->k0:S

    .line 52
    .line 53
    int-to-long v8, p1

    .line 54
    iput-byte v2, p0, Lzr1;->g0:B

    .line 55
    .line 56
    iget-object v6, p0, Lzr1;->i0:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v7, p0, Lzr1;->j0:Lbr1;

    .line 59
    .line 60
    iget-object v10, p0, Lzr1;->l0:Lgn2;

    .line 61
    .line 62
    move-object v11, p0

    .line 63
    invoke-virtual/range {v5 .. v11}, Lbs1;->c(Ljava/lang/String;Lbr1;JLgn2;Ls51;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v4, :cond_4

    .line 68
    .line 69
    :goto_1
    return-object v4

    .line 70
    :cond_4
    :goto_2
    check-cast p1, Ln28;

    .line 71
    .line 72
    new-instance p0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v0, "domainStr:"

    .line 75
    .line 76
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v11, Lzr1;->m0:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, " result:"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    iget-object v0, v11, Lzr1;->l0:Lgn2;

    .line 97
    .line 98
    invoke-interface {v0, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    iget-object p0, p1, Ln28;->b:Lm28;

    .line 102
    .line 103
    sget-object v0, Lyr1;->a:[I

    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    aget p0, v0, p0

    .line 110
    .line 111
    sget-object v0, Ldn8;->a:Ldn8;

    .line 112
    .line 113
    if-ne p0, v3, :cond_6

    .line 114
    .line 115
    iget-object p0, p1, Ln28;->c:Ljava/lang/Integer;

    .line 116
    .line 117
    if-eqz p0, :cond_5

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    iget-object p1, p1, Ln28;->a:Ljava/lang/String;

    .line 124
    .line 125
    new-instance v1, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-direct {v1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 128
    .line 129
    .line 130
    iget-object p0, v11, Lzr1;->n0:Ljava/util/LinkedHashMap;

    .line 131
    .line 132
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_5
    return-object v1

    .line 137
    :cond_6
    return-object v0
.end method
