.class public final Le59;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;


# instance fields
.field public q0:Lfp1;

.field public r0:Lrn2;


# virtual methods
.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 8

    .line 1
    iget-object v0, p0, Le59;->q0:Lfp1;

    .line 2
    .line 3
    sget-object v1, Lfp1;->X:Lfp1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p3, p4}, Lq31;->j(J)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :goto_0
    iget-object v1, p0, Le59;->q0:Lfp1;

    .line 15
    .line 16
    sget-object v3, Lfp1;->Y:Lfp1;

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-static {p3, p4}, Lq31;->i(J)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    :goto_1
    invoke-static {p3, p4}, Lq31;->h(J)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p3, p4}, Lq31;->g(J)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-static {v0, v1, v2, v3}, Ls31;->a(IIII)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-interface {p2, v0, v1}, Ltr4;->o(J)Leo5;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget p2, v5, Leo5;->X:I

    .line 42
    .line 43
    invoke-static {p3, p4}, Lq31;->j(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p3, p4}, Lq31;->h(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {p2, v0, v1}, Lx97;->n(III)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iget p2, v5, Leo5;->Y:I

    .line 56
    .line 57
    invoke-static {p3, p4}, Lq31;->i(J)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {p3, p4}, Lq31;->g(J)I

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    invoke-static {p2, v0, p3}, Lx97;->n(III)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    new-instance v2, Ld59;

    .line 70
    .line 71
    move-object v3, p0

    .line 72
    move-object v7, p1

    .line 73
    invoke-direct/range {v2 .. v7}, Ld59;-><init>(Le59;ILeo5;ILzr4;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Le02;->X:Le02;

    .line 77
    .line 78
    invoke-interface {v7, v4, v6, p0, v2}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method
