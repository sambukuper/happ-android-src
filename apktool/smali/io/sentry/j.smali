.class public final Lio/sentry/j;
.super Ljava/util/AbstractCollection;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/Queue;
.implements Ljava/io/Serializable;


# instance fields
.field public final transient X:[Ljava/lang/Object;

.field public transient Y:I

.field public transient Z:I

.field public transient f0:Z

.field public final g0:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lio/sentry/j;->Y:I

    .line 6
    .line 7
    iput v0, p0, Lio/sentry/j;->Z:I

    .line 8
    .line 9
    iput-boolean v0, p0, Lio/sentry/j;->f0:Z

    .line 10
    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    new-array p1, p1, [Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p1, p0, Lio/sentry/j;->X:[Ljava/lang/Object;

    .line 16
    .line 17
    array-length p1, p1

    .line 18
    iput p1, p0, Lio/sentry/j;->g0:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "The size must be greater than 0"

    .line 22
    .line 23
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Lio/sentry/j;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    iget v2, p0, Lio/sentry/j;->g0:I

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lio/sentry/j;->remove()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v1, p0, Lio/sentry/j;->Z:I

    .line 16
    .line 17
    add-int/lit8 v3, v1, 0x1

    .line 18
    .line 19
    iput v3, p0, Lio/sentry/j;->Z:I

    .line 20
    .line 21
    iget-object v4, p0, Lio/sentry/j;->X:[Ljava/lang/Object;

    .line 22
    .line 23
    aput-object p1, v4, v1

    .line 24
    .line 25
    if-lt v3, v2, :cond_1

    .line 26
    .line 27
    iput v0, p0, Lio/sentry/j;->Z:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v0, v3

    .line 31
    :goto_0
    iget p1, p0, Lio/sentry/j;->Y:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-ne v0, p1, :cond_2

    .line 35
    .line 36
    iput-boolean v1, p0, Lio/sentry/j;->f0:Z

    .line 37
    .line 38
    :cond_2
    return v1

    .line 39
    :cond_3
    const-string p0, "Attempted to add null object to queue"

    .line 40
    .line 41
    invoke-static {p0}, Lb61;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v0
.end method

.method public final clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lio/sentry/j;->f0:Z

    .line 3
    .line 4
    iput v0, p0, Lio/sentry/j;->Y:I

    .line 5
    .line 6
    iput v0, p0, Lio/sentry/j;->Z:I

    .line 7
    .line 8
    iget-object p0, p0, Lio/sentry/j;->X:[Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final element()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/j;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/j;->peek()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "queue is empty"

    .line 13
    .line 14
    invoke-static {p0}, Lem7;->g(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/sentry/j;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lio/sentry/i;-><init>(Lio/sentry/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/sentry/j;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0
.end method

.method public final peek()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/j;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-object v0, p0, Lio/sentry/j;->X:[Ljava/lang/Object;

    .line 10
    .line 11
    iget p0, p0, Lio/sentry/j;->Y:I

    .line 12
    .line 13
    aget-object p0, v0, p0

    .line 14
    .line 15
    return-object p0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/j;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lio/sentry/j;->remove()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final remove()Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/sentry/j;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    iget v0, p0, Lio/sentry/j;->Y:I

    .line 9
    .line 10
    iget-object v2, p0, Lio/sentry/j;->X:[Ljava/lang/Object;

    .line 11
    .line 12
    aget-object v3, v2, v0

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    add-int/lit8 v4, v0, 0x1

    .line 17
    .line 18
    iput v4, p0, Lio/sentry/j;->Y:I

    .line 19
    .line 20
    aput-object v1, v2, v0

    .line 21
    .line 22
    iget v0, p0, Lio/sentry/j;->g0:I

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-lt v4, v0, :cond_0

    .line 26
    .line 27
    iput v1, p0, Lio/sentry/j;->Y:I

    .line 28
    .line 29
    :cond_0
    iput-boolean v1, p0, Lio/sentry/j;->f0:Z

    .line 30
    .line 31
    :cond_1
    return-object v3

    .line 32
    :cond_2
    const-string p0, "queue is empty"

    .line 33
    .line 34
    invoke-static {p0}, Lem7;->g(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v1
.end method

.method public final size()I
    .locals 3

    .line 1
    iget v0, p0, Lio/sentry/j;->Z:I

    .line 2
    .line 3
    iget v1, p0, Lio/sentry/j;->Y:I

    .line 4
    .line 5
    iget v2, p0, Lio/sentry/j;->g0:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr v2, v1

    .line 10
    add-int/2addr v2, v0

    .line 11
    return v2

    .line 12
    :cond_0
    if-ne v0, v1, :cond_2

    .line 13
    .line 14
    iget-boolean p0, p0, Lio/sentry/j;->f0:Z

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_2
    sub-int/2addr v0, v1

    .line 22
    return v0
.end method
