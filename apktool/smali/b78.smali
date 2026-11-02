.class public final Lb78;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;
.implements Las2;
.implements Ls01;


# instance fields
.field public s0:Ly78;

.field public t0:Z

.field public final u0:Lr80;

.field public v0:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ly78;Lkd8;Lo88;ZLwx3;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb78;->s0:Ly78;

    .line 5
    .line 6
    iput-boolean p4, p0, Lb78;->t0:Z

    .line 7
    .line 8
    new-instance p4, Lr80;

    .line 9
    .line 10
    iget-object p1, p1, Ly78;->g:Lq80;

    .line 11
    .line 12
    invoke-direct {p4, p1}, Lr80;-><init>(Lq80;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p4}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 16
    .line 17
    .line 18
    iput-object p4, p0, Lb78;->u0:Lr80;

    .line 19
    .line 20
    iget-object p1, p0, Lb78;->s0:Ly78;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-boolean v3, p0, Lb78;->t0:Z

    .line 26
    .line 27
    xor-int/lit8 v4, v3, 0x1

    .line 28
    .line 29
    iget-object p0, p1, Ly78;->a:Lu58;

    .line 30
    .line 31
    new-instance v0, Lt58;

    .line 32
    .line 33
    iget p1, p5, Lwx3;->c:I

    .line 34
    .line 35
    const/4 p4, 0x4

    .line 36
    if-ne p1, p4, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    :goto_0
    move v5, p1

    .line 40
    move-object v1, p2

    .line 41
    move-object v2, p3

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    goto :goto_0

    .line 45
    :goto_1
    invoke-direct/range {v0 .. v5}, Lt58;-><init>(Lkd8;Lo88;ZZZ)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lu58;->X:Lrh5;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 7

    .line 1
    iget-object v0, p0, Lb78;->s0:Ly78;

    .line 2
    .line 3
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v1, Ly01;->k:Lox1;

    .line 8
    .line 9
    invoke-static {p0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, Lfi2;

    .line 15
    .line 16
    iget-object v0, v0, Ly78;->a:Lu58;

    .line 17
    .line 18
    new-instance v1, Ls58;

    .line 19
    .line 20
    move-object v2, p1

    .line 21
    move-wide v5, p3

    .line 22
    invoke-direct/range {v1 .. v6}, Ls58;-><init>(Lzr4;Lz24;Lfi2;J)V

    .line 23
    .line 24
    .line 25
    iget-object p1, v0, Lu58;->Y:Lrh5;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v0, Lu58;->X:Lrh5;

    .line 31
    .line 32
    invoke-virtual {p1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lt58;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0, p1, v1}, Lu58;->a(Lt58;Ls58;)Lx78;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-wide p3, p1, Lx78;->c:J

    .line 45
    .line 46
    const/16 v0, 0x20

    .line 47
    .line 48
    shr-long v0, p3, v0

    .line 49
    .line 50
    long-to-int v0, v0

    .line 51
    const-wide v3, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr p3, v3

    .line 57
    long-to-int p3, p3

    .line 58
    invoke-static {v0, v0, p3, p3}, Lz68;->B(IIII)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    invoke-interface {p2, v3, v4}, Ltr4;->o(J)Leo5;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget-object p4, p0, Lb78;->s0:Ly78;

    .line 67
    .line 68
    iget-boolean v1, p0, Lb78;->t0:Z

    .line 69
    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    iget-object v3, p1, Lx78;->b:Lbz4;

    .line 74
    .line 75
    invoke-virtual {v3, v1}, Lbz4;->a(I)F

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-static {v1}, Lz38;->a(F)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-interface {v2, v1}, Lfi1;->R(I)F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    const/4 v1, 0x0

    .line 89
    :goto_0
    iget-object p4, p4, Ly78;->f:Lrh5;

    .line 90
    .line 91
    new-instance v3, Lkt1;

    .line 92
    .line 93
    invoke-direct {v3, v1}, Lkt1;-><init>(F)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p4, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object p4, p0, Lb78;->v0:Ljava/util/Map;

    .line 100
    .line 101
    if-nez p4, :cond_1

    .line 102
    .line 103
    new-instance p4, Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    invoke-direct {p4, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 107
    .line 108
    .line 109
    :cond_1
    sget-object v1, Lu8;->a:Lt03;

    .line 110
    .line 111
    iget v3, p1, Lx78;->d:F

    .line 112
    .line 113
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-interface {p4, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    sget-object v1, Lu8;->b:Lt03;

    .line 125
    .line 126
    iget p1, p1, Lx78;->e:F

    .line 127
    .line 128
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {p4, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    iput-object p4, p0, Lb78;->v0:Ljava/util/Map;

    .line 140
    .line 141
    new-instance p0, Ld1;

    .line 142
    .line 143
    const/16 p1, 0x10

    .line 144
    .line 145
    invoke-direct {p0, p2, p1}, Ld1;-><init>(Leo5;B)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v2, v0, p3, p4, p0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :cond_2
    const-string p0, "Called layoutWithNewMeasureInputs before updateNonMeasureInputs"

    .line 154
    .line 155
    invoke-static {p0}, Lzc3;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 156
    .line 157
    .line 158
    invoke-static {}, Lb61;->n()V

    .line 159
    .line 160
    .line 161
    const/4 p0, 0x0

    .line 162
    return-object p0
.end method

.method public final e0(Li55;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb78;->s0:Ly78;

    .line 2
    .line 3
    iget-object p0, p0, Ly78;->c:Lrh5;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
