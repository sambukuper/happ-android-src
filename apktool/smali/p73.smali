.class public final synthetic Lp73;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Ljava/lang/String;

.field public final synthetic Y:Ljava/util/List;

.field public final synthetic Z:I

.field public final synthetic f0:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp73;->X:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lp73;->Y:Ljava/util/List;

    .line 7
    .line 8
    iput p3, p0, Lp73;->Z:I

    .line 9
    .line 10
    iput-boolean p4, p0, Lp73;->f0:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lg48;

    .line 2
    .line 3
    iget-object v0, p1, Lg48;->j0:Lf88;

    .line 4
    .line 5
    iget-object v1, p0, Lp73;->X:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lp73;->Y:Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-wide v3, v0, Lf88;->a:J

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    shr-long v5, v3, v0

    .line 16
    .line 17
    long-to-int v0, v5

    .line 18
    const-wide v5, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v3, v5

    .line 24
    long-to-int v3, v3

    .line 25
    invoke-static {p1, v0, v3, v1}, Lw79;->E(Lg48;IILjava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-lez v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    add-int/2addr v3, v0

    .line 39
    invoke-virtual {p1, v0, v3, v2}, Lg48;->e(IILjava/util/List;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-wide v3, p1, Lg48;->i0:J

    .line 44
    .line 45
    invoke-static {v3, v4}, Lf88;->d(J)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-wide v3, p1, Lg48;->i0:J

    .line 50
    .line 51
    invoke-static {v3, v4}, Lf88;->c(J)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {p1, v0, v3, v1}, Lw79;->E(Lg48;IILjava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-lez v3, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    add-int/2addr v3, v0

    .line 69
    invoke-virtual {p1, v0, v3, v2}, Lg48;->e(IILjava/util/List;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    :goto_0
    iget-wide v2, p1, Lg48;->i0:J

    .line 73
    .line 74
    invoke-static {v2, v3}, Lf88;->d(J)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget v2, p0, Lp73;->Z:I

    .line 79
    .line 80
    if-lez v2, :cond_2

    .line 81
    .line 82
    add-int/2addr v0, v2

    .line 83
    add-int/lit8 v0, v0, -0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    add-int/2addr v0, v2

    .line 87
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    sub-int/2addr v0, v1

    .line 92
    :goto_1
    iget-boolean p0, p0, Lp73;->f0:Z

    .line 93
    .line 94
    iput-boolean p0, p1, Lg48;->g0:Z

    .line 95
    .line 96
    iget-object p0, p1, Lg48;->Z:Lmi5;

    .line 97
    .line 98
    invoke-virtual {p0}, Lmi5;->length()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-static {v0, v1, p0}, Lx97;->n(III)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p0, p0}, Lct7;->c(II)J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    invoke-virtual {p1, v0, v1}, Lg48;->g(J)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Ldn8;->a:Ldn8;

    .line 115
    .line 116
    return-object p0
.end method
