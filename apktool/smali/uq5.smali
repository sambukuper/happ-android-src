.class public final Luq5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxr6;


# instance fields
.field public final X:Lxr6;

.field public final Y:J

.field public final synthetic Z:Lbr5;


# direct methods
.method public constructor <init>(Lbr5;Lxr6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luq5;->Z:Lbr5;

    .line 8
    .line 9
    iput-object p2, p0, Luq5;->X:Lxr6;

    .line 10
    .line 11
    invoke-static {}, Lpw7;->e()J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    iput-wide p1, p0, Luq5;->Y:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final S0()Z
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0}, Lxr6;->S0()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 32
    .line 33
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    const-string p0, "Statement is recycled"

    .line 38
    .line 39
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final T(ILjava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 5
    .line 6
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/16 v2, 0x15

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-wide v3, p0, Luq5;->Y:J

    .line 18
    .line 19
    invoke-static {}, Lpw7;->e()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    cmp-long v0, v3, v5

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 28
    .line 29
    invoke-interface {p0, p1, p2}, Lxr6;->T(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 34
    .line 35
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_1
    const-string p0, "Statement is recycled"

    .line 40
    .line 41
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1
.end method

.method public final close()V
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 31
    .line 32
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    const-string p0, "Statement is recycled"

    .line 37
    .line 38
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public final getBlob(I)[B
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lxr6;->getBlob(I)[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 32
    .line 33
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    const-string p0, "Statement is recycled"

    .line 38
    .line 39
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final getColumnCount()I
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0}, Lxr6;->getColumnCount()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 32
    .line 33
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    const-string p0, "Statement is recycled"

    .line 38
    .line 39
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lxr6;->getColumnName(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 32
    .line 33
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    const-string p0, "Statement is recycled"

    .line 38
    .line 39
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final getLong(I)J
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lxr6;->getLong(I)J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    return-wide p0

    .line 31
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 32
    .line 33
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    const-string p0, "Statement is recycled"

    .line 38
    .line 39
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final h(ID)V
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0, p1, p2, p3}, Lxr6;->h(ID)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 31
    .line 32
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    const-string p0, "Statement is recycled"

    .line 37
    .line 38
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public final i(IJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0, p1, p2, p3}, Lxr6;->i(IJ)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 31
    .line 32
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    const-string p0, "Statement is recycled"

    .line 37
    .line 38
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public final isNull(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lxr6;->isNull(I)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 32
    .line 33
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    const-string p0, "Statement is recycled"

    .line 38
    .line 39
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final j(I[B)V
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0, p1, p2}, Lxr6;->j(I[B)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 31
    .line 32
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    const-string p0, "Statement is recycled"

    .line 37
    .line 38
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public final l(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lxr6;->l(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 31
    .line 32
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    const-string p0, "Statement is recycled"

    .line 37
    .line 38
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public final p0(I)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lxr6;->p0(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 32
    .line 33
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    const-string p0, "Statement is recycled"

    .line 38
    .line 39
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final reset()V
    .locals 7

    .line 1
    iget-object v0, p0, Luq5;->Z:Lbr5;

    .line 2
    .line 3
    iget-object v0, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v3, p0, Luq5;->Y:J

    .line 15
    .line 16
    invoke-static {}, Lpw7;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v3, v5

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Luq5;->X:Lxr6;

    .line 25
    .line 26
    invoke-interface {p0}, Lxr6;->reset()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 31
    .line 32
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    const-string p0, "Statement is recycled"

    .line 37
    .line 38
    invoke-static {v2, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method
