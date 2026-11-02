.class public final Leo8;
.super Ln75;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/Integer;

.field public final e:Lbx5;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lbx5;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    invoke-direct {p0, v0, p4}, Ln75;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Leo8;->c:Ljava/lang/Integer;

    .line 15
    .line 16
    iput-object p2, p0, Leo8;->d:Ljava/lang/Integer;

    .line 17
    .line 18
    iput-object p3, p0, Leo8;->e:Lbx5;

    .line 19
    .line 20
    iput-boolean p5, p0, Leo8;->f:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    new-instance p0, Lkf3;

    .line 25
    .line 26
    const/16 p1, 0x9

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-direct {p0, p2, p1, p2}, Lif3;-><init>(III)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-gt p2, p1, :cond_1

    .line 37
    .line 38
    iget p0, p0, Lif3;->Y:I

    .line 39
    .line 40
    if-gt p1, p0, :cond_1

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    const-string p0, "Invalid length for field "

    .line 44
    .line 45
    const-string p1, ": "

    .line 46
    .line 47
    invoke-static {p0, p4, p1, v0}, Lxw3;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;IILjava/lang/Object;)Lo75;
    .locals 3

    .line 1
    iget-object v0, p0, Leo8;->d:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sub-int v1, p3, p2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-le v1, v2, :cond_0

    .line 12
    .line 13
    new-instance p0, Lr75;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/16 p2, 0x8

    .line 20
    .line 21
    invoke-direct {p0, p2, p1}, Lr75;-><init>(BI)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    iget-object v0, p0, Leo8;->c:Ljava/lang/Integer;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    sub-int v1, p3, p2

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ge v1, v2, :cond_1

    .line 36
    .line 37
    new-instance p0, Lr75;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    const/4 p2, 0x7

    .line 44
    invoke-direct {p0, p2, p1}, Lr75;-><init>(BI)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    const/4 v0, 0x0

    .line 49
    :goto_0
    const/4 v1, 0x0

    .line 50
    if-ge p2, p3, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    mul-int/lit8 v0, v0, 0xa

    .line 57
    .line 58
    add-int/lit8 v2, v2, -0x30

    .line 59
    .line 60
    add-int/2addr v0, v2

    .line 61
    if-gez v0, :cond_2

    .line 62
    .line 63
    move-object p1, v1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_1
    if-nez p1, :cond_4

    .line 73
    .line 74
    sget-object p0, Llh4;->m0:Llh4;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_4
    iget-boolean p2, p0, Leo8;->f:Z

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p2, :cond_5

    .line 84
    .line 85
    neg-int p1, p1

    .line 86
    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p0, p0, Leo8;->e:Lbx5;

    .line 91
    .line 92
    invoke-virtual {p0, p4, p1}, Lbx5;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-nez p0, :cond_6

    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_6
    new-instance p1, Lf4;

    .line 100
    .line 101
    invoke-direct {p1, p0}, Lf4;-><init>(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-object p1
.end method
