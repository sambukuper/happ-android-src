.class public final Lk43;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final X:Ljava/lang/Object;

.field public final Y:Lm90;

.field public Z:Z

.field public final f0:Lmd0;

.field public g0:[B

.field public h0:[C

.field public i0:Z


# direct methods
.method public constructor <init>(Lmd0;Lm90;Lx41;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lk43;->Z:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lk43;->i0:Z

    .line 9
    .line 10
    iput-object p1, p0, Lk43;->f0:Lmd0;

    .line 11
    .line 12
    iput-object p2, p0, Lk43;->Y:Lm90;

    .line 13
    .line 14
    iget-object p1, p3, Lx41;->X:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, p0, Lk43;->X:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk43;->i0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lk43;->i0:Z

    .line 7
    .line 8
    iget-boolean v0, p0, Lk43;->Z:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lk43;->Z:Z

    .line 14
    .line 15
    iget-object p0, p0, Lk43;->Y:Lm90;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final g([B)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk43;->g0:[B

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    array-length v0, v0

    .line 7
    if-lt v1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p0, "Trying to release buffer smaller than original"

    .line 11
    .line 12
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lk43;->g0:[B

    .line 18
    .line 19
    iget-object p0, p0, Lk43;->Y:Lm90;

    .line 20
    .line 21
    iget-object p0, p0, Lm90;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, [B

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    array-length v2, p1

    .line 33
    array-length v1, v1

    .line 34
    if-le v2, v1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    return-void

    .line 38
    :cond_3
    :goto_1
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
