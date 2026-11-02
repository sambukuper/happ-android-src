.class public final Lw77;
.super Lb3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:J

.field public b:Lmm0;


# virtual methods
.method public final a(La3;)Z
    .locals 4

    .line 1
    check-cast p1, Lu77;

    .line 2
    .line 3
    iget-wide v0, p0, Lw77;->a:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-wide v0, p1, Lu77;->k0:J

    .line 14
    .line 15
    iget-wide v2, p1, Lu77;->l0:J

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-gez v2, :cond_1

    .line 20
    .line 21
    iput-wide v0, p1, Lu77;->l0:J

    .line 22
    .line 23
    :cond_1
    iput-wide v0, p0, Lw77;->a:J

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method public final b(La3;)[Lq51;
    .locals 4

    .line 1
    check-cast p1, Lu77;

    .line 2
    .line 3
    iget-wide v0, p0, Lw77;->a:J

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    iput-wide v2, p0, Lw77;->a:J

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, p0, Lw77;->b:Lmm0;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lu77;->x(J)[Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
