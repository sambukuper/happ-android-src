.class public final Lh68;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:La23;

.field public b:I

.field public c:J

.field public d:Z

.field public final synthetic e:Lr68;


# direct methods
.method public constructor <init>(Lr68;La23;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh68;->e:Lr68;

    .line 5
    .line 6
    iput-object p2, p0, Lh68;->a:La23;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lh68;->b:I

    .line 10
    .line 11
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide p1, p0, Lh68;->c:J

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lh68;->d:Z

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    sget-object v0, Lg68;->X:Lg68;

    .line 2
    .line 3
    iget-object v1, p0, Lh68;->e:Lr68;

    .line 4
    .line 5
    iget-object v2, v1, Lr68;->q:Lrh5;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, Lh68;->d:Z

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Lr68;->s()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final b(JLkp5;Lx78;Z)J
    .locals 12

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    iget-object v0, v0, Lx78;->a:Lw78;

    .line 4
    .line 5
    iget-object v0, v0, Lw78;->a:Lql;

    .line 6
    .line 7
    iget-object v0, v0, Lql;->Y:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lh68;->b:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    iget-object v3, p0, Lh68;->e:Lr68;

    .line 17
    .line 18
    if-ltz v1, :cond_0

    .line 19
    .line 20
    if-gt v1, v0, :cond_0

    .line 21
    .line 22
    :goto_0
    move v5, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v0, v3, Lr68;->b:Ly78;

    .line 25
    .line 26
    iget-wide v4, p0, Lh68;->c:J

    .line 27
    .line 28
    invoke-virtual {v0, v4, v5, v2}, Ly78;->d(JZ)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v3, Lr68;->b:Ly78;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2, v2}, Ly78;->d(JZ)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    iget-object p1, v3, Lr68;->a:Lkd8;

    .line 40
    .line 41
    invoke-virtual {p1}, Lkd8;->d()Lh48;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    move-object v8, p3

    .line 49
    move/from16 v10, p5

    .line 50
    .line 51
    invoke-virtual/range {v3 .. v11}, Lr68;->C(Lh48;IIZLkp5;ZZLfz2;)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    iget v0, p0, Lh68;->b:I

    .line 56
    .line 57
    const/4 v1, -0x1

    .line 58
    const/16 v2, 0x20

    .line 59
    .line 60
    if-ne v0, v1, :cond_1

    .line 61
    .line 62
    invoke-static {p1, p2}, Lf88;->b(J)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    shr-long v0, p1, v2

    .line 69
    .line 70
    long-to-int v0, v0

    .line 71
    iput v0, p0, Lh68;->b:I

    .line 72
    .line 73
    :cond_1
    invoke-static {p1, p2}, Lf88;->e(J)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    const-wide v0, 0xffffffffL

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    and-long/2addr v0, p1

    .line 85
    long-to-int p0, v0

    .line 86
    shr-long/2addr p1, v2

    .line 87
    long-to-int p1, p1

    .line 88
    invoke-static {p0, p1}, Lct7;->c(II)J

    .line 89
    .line 90
    .line 91
    move-result-wide p1

    .line 92
    :cond_2
    iget-object p0, v3, Lr68;->a:Lkd8;

    .line 93
    .line 94
    invoke-virtual {p0, p1, p2}, Lkd8;->j(J)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Ls88;->Z:Ls88;

    .line 98
    .line 99
    invoke-virtual {v3, p0}, Lr68;->y(Ls88;)V

    .line 100
    .line 101
    .line 102
    return-wide p1
.end method
