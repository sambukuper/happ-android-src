.class public final Ls43;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(JJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ls43;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Ls43;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, Ls43;->c:J

    .line 9
    .line 10
    iput-wide p7, p0, Ls43;->d:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_6

    .line 5
    .line 6
    instance-of v0, p1, Ls43;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    check-cast p1, Ls43;

    .line 12
    .line 13
    iget-wide v0, p1, Ls43;->a:J

    .line 14
    .line 15
    sget v2, Ldw0;->h:I

    .line 16
    .line 17
    iget-wide v2, p0, Ls43;->a:J

    .line 18
    .line 19
    invoke-static {v2, v3, v0, v1}, Ltk8;->a(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    iget-wide v0, p0, Ls43;->b:J

    .line 27
    .line 28
    iget-wide v2, p1, Ls43;->b:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, Ltk8;->a(JJ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget-wide v0, p0, Ls43;->c:J

    .line 38
    .line 39
    iget-wide v2, p1, Ls43;->c:J

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Ltk8;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    iget-wide v0, p0, Ls43;->d:J

    .line 49
    .line 50
    iget-wide p0, p1, Ls43;->d:J

    .line 51
    .line 52
    invoke-static {v0, v1, p0, p1}, Ltk8;->a(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_5

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_5
    :goto_0
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 62
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, Ldw0;->h:I

    .line 2
    .line 3
    iget-wide v0, p0, Ls43;->a:J

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
    iget-wide v2, p0, Ls43;->b:J

    .line 13
    .line 14
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-wide v2, p0, Ls43;->c:J

    .line 19
    .line 20
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v1, p0, Ls43;->d:J

    .line 25
    .line 26
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v0

    .line 31
    return p0
.end method
