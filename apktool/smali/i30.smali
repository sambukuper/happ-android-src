.class public final Li30;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lq38;


# instance fields
.field public final a:Lzy0;

.field public final b:Lm15;

.field public final c:Lrh5;


# direct methods
.method public constructor <init>(Lzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li30;->a:Lzy0;

    .line 5
    .line 6
    new-instance p1, Lm15;

    .line 7
    .line 8
    invoke-direct {p1}, Lm15;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Li30;->b:Lm15;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Li30;->c:Lrh5;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lh38;Luy7;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, Lh30;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lh30;-><init>(Lh38;)V

    .line 4
    .line 5
    .line 6
    new-instance v4, Lda;

    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    const/4 v5, 0x0

    .line 10
    invoke-direct {v4, p0, v0, v5, p1}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lkg3;

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    sget-object v2, Lf15;->X:Lf15;

    .line 17
    .line 18
    iget-object v3, p0, Li30;->b:Lm15;

    .line 19
    .line 20
    invoke-direct/range {v1 .. v6}, Lkg3;-><init>(Lf15;Ljava/lang/Object;Lgn2;Lq51;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, p2}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, Lc71;->X:Lc71;

    .line 28
    .line 29
    if-ne p0, p1, :cond_0

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 33
    .line 34
    return-object p0
.end method

.method public final b(Ldn2;Llp2;I)V
    .locals 11

    .line 1
    const v0, 0x2b25d11e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v0, 0x10

    .line 17
    .line 18
    :goto_0
    or-int/2addr v0, p3

    .line 19
    and-int/lit8 v1, v0, 0x13

    .line 20
    .line 21
    const/16 v2, 0x12

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x1

    .line 25
    if-eq v1, v2, :cond_1

    .line 26
    .line 27
    move v1, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v3

    .line 30
    :goto_1
    and-int/2addr v0, v4

    .line 31
    invoke-virtual {p2, v0, v1}, Llp2;->N(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-object v0, p0, Li30;->c:Lrh5;

    .line 38
    .line 39
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v6, v0

    .line 44
    check-cast v6, Lh30;

    .line 45
    .line 46
    if-nez v6, :cond_2

    .line 47
    .line 48
    invoke-virtual {p2}, Llp2;->r()Lj86;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    new-instance v0, Lg30;

    .line 55
    .line 56
    invoke-direct {v0, p0, p1, p3, v3}, Lg30;-><init>(Li30;Ldn2;IB)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p2, Lj86;->d:Lrn2;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    iget-object v7, v6, Lh30;->a:Lh38;

    .line 63
    .line 64
    const/16 v0, 0x180

    .line 65
    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    iget-object v5, p0, Li30;->a:Lzy0;

    .line 71
    .line 72
    move-object v8, p1

    .line 73
    move-object v9, p2

    .line 74
    invoke-virtual/range {v5 .. v10}, Lzy0;->N(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move-object v8, p1

    .line 79
    move-object v9, p2

    .line 80
    invoke-virtual {v9}, Llp2;->Q()V

    .line 81
    .line 82
    .line 83
    :goto_2
    invoke-virtual {v9}, Llp2;->r()Lj86;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    new-instance p2, Lg30;

    .line 90
    .line 91
    invoke-direct {p2, p0, v8, p3, v4}, Lg30;-><init>(Li30;Ldn2;IB)V

    .line 92
    .line 93
    .line 94
    iput-object p2, p1, Lj86;->d:Lrn2;

    .line 95
    .line 96
    :cond_4
    return-void
.end method
