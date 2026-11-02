.class public final Lbs;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final i:Lbs;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, Lbs;

    .line 2
    .line 3
    sget-wide v1, Ldw0;->c:J

    .line 4
    .line 5
    sget-wide v3, Lep;->c:J

    .line 6
    .line 7
    sget-wide v7, Lep;->w:J

    .line 8
    .line 9
    const/high16 v5, 0x3f000000    # 0.5f

    .line 10
    .line 11
    invoke-static {v5, v1, v2}, Ldw0;->b(FJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v9

    .line 15
    sget-wide v11, Lep;->d:J

    .line 16
    .line 17
    sget-wide v13, Lep;->x:J

    .line 18
    .line 19
    sget-wide v15, Lep;->l:J

    .line 20
    .line 21
    move-wide v5, v1

    .line 22
    invoke-direct/range {v0 .. v16}, Lbs;-><init>(JJJJJJJJ)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lbs;->i:Lbs;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(JJJJJJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lbs;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lbs;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, Lbs;->c:J

    .line 9
    .line 10
    iput-wide p7, p0, Lbs;->d:J

    .line 11
    .line 12
    iput-wide p9, p0, Lbs;->e:J

    .line 13
    .line 14
    iput-wide p11, p0, Lbs;->f:J

    .line 15
    .line 16
    iput-wide p13, p0, Lbs;->g:J

    .line 17
    .line 18
    move-wide p1, p15

    .line 19
    iput-wide p1, p0, Lbs;->h:J

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lbs;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lbs;

    .line 10
    .line 11
    iget-wide v0, p1, Lbs;->a:J

    .line 12
    .line 13
    sget v2, Ldw0;->h:I

    .line 14
    .line 15
    iget-wide v2, p0, Lbs;->a:J

    .line 16
    .line 17
    invoke-static {v2, v3, v0, v1}, Ltk8;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-wide v0, p0, Lbs;->b:J

    .line 25
    .line 26
    iget-wide v2, p1, Lbs;->b:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Ltk8;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-wide v0, p0, Lbs;->c:J

    .line 36
    .line 37
    iget-wide v2, p1, Lbs;->c:J

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Ltk8;->a(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-wide v0, p0, Lbs;->d:J

    .line 47
    .line 48
    iget-wide v2, p1, Lbs;->d:J

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, Ltk8;->a(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-wide v0, p0, Lbs;->e:J

    .line 58
    .line 59
    iget-wide v2, p1, Lbs;->e:J

    .line 60
    .line 61
    invoke-static {v0, v1, v2, v3}, Ltk8;->a(JJ)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_6
    iget-wide v0, p0, Lbs;->f:J

    .line 69
    .line 70
    iget-wide v2, p1, Lbs;->f:J

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3}, Ltk8;->a(JJ)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_7
    iget-wide v0, p0, Lbs;->g:J

    .line 80
    .line 81
    iget-wide v2, p1, Lbs;->g:J

    .line 82
    .line 83
    invoke-static {v0, v1, v2, v3}, Ltk8;->a(JJ)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_8

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_8
    iget-wide v0, p0, Lbs;->h:J

    .line 91
    .line 92
    iget-wide p0, p1, Lbs;->h:J

    .line 93
    .line 94
    invoke-static {v0, v1, p0, p1}, Ltk8;->a(JJ)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_9

    .line 99
    .line 100
    :goto_0
    const/4 p0, 0x0

    .line 101
    return p0

    .line 102
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 103
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, Ldw0;->h:I

    .line 2
    .line 3
    iget-wide v0, p0, Lbs;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-wide v2, p0, Lbs;->b:J

    .line 13
    .line 14
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-wide v2, p0, Lbs;->c:J

    .line 19
    .line 20
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v2, p0, Lbs;->d:J

    .line 25
    .line 26
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-wide v2, p0, Lbs;->e:J

    .line 31
    .line 32
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-wide v2, p0, Lbs;->f:J

    .line 37
    .line 38
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-wide v2, p0, Lbs;->g:J

    .line 43
    .line 44
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-wide v1, p0, Lbs;->h:J

    .line 49
    .line 50
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/2addr p0, v0

    .line 55
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-wide v0, p0, Lbs;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ldw0;->h(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Lbs;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Ldw0;->h(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, Lbs;->c:J

    .line 14
    .line 15
    invoke-static {v2, v3}, Ldw0;->h(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, Lbs;->d:J

    .line 20
    .line 21
    invoke-static {v3, v4}, Ldw0;->h(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, Lbs;->e:J

    .line 26
    .line 27
    invoke-static {v4, v5}, Ldw0;->h(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-wide v5, p0, Lbs;->f:J

    .line 32
    .line 33
    invoke-static {v5, v6}, Ldw0;->h(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-wide v6, p0, Lbs;->g:J

    .line 38
    .line 39
    invoke-static {v6, v7}, Ldw0;->h(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget-wide v7, p0, Lbs;->h:J

    .line 44
    .line 45
    invoke-static {v7, v8}, Ldw0;->h(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v7, ", trackChecked="

    .line 50
    .line 51
    const-string v8, ", thumbUnchecked="

    .line 52
    .line 53
    const-string v9, "AppToggleColors(thumbChecked="

    .line 54
    .line 55
    invoke-static {v9, v0, v7, v1, v8}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, ", trackUnchecked="

    .line 60
    .line 61
    const-string v7, ", thumbCheckedDisabled="

    .line 62
    .line 63
    invoke-static {v0, v2, v1, v3, v7}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v1, ", trackCheckedDisabled="

    .line 67
    .line 68
    const-string v2, ", thumbUncheckedDisabled="

    .line 69
    .line 70
    invoke-static {v0, v4, v1, v5, v2}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, ", trackUncheckedDisabled="

    .line 74
    .line 75
    const-string v2, ")"

    .line 76
    .line 77
    invoke-static {v0, v6, v1, p0, v2}, Loi0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
