.class public abstract Ln13;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lje7;


# instance fields
.field public final X:Ldk2;

.field public Y:Z

.field public final synthetic Z:Lr13;


# direct methods
.method public constructor <init>(Lr13;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln13;->Z:Lr13;

    .line 5
    .line 6
    new-instance v0, Ldk2;

    .line 7
    .line 8
    iget-object p1, p1, Lr13;->c:Lba0;

    .line 9
    .line 10
    invoke-interface {p1}, Lje7;->timeout()Lta8;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ldk2;-><init>(Lta8;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ln13;->X:Ldk2;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Ln13;->Z:Lr13;

    .line 2
    .line 3
    iget-byte v1, v0, Lr13;->e:B

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v3, 0x5

    .line 10
    if-ne v1, v3, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Ln13;->X:Ldk2;

    .line 13
    .line 14
    iget-object v1, p0, Ldk2;->a:Lta8;

    .line 15
    .line 16
    sget-object v3, Lta8;->NONE:Lta8;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iput-object v3, p0, Ldk2;->a:Lta8;

    .line 22
    .line 23
    invoke-virtual {v1}, Lta8;->clearDeadline()Lta8;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lta8;->clearTimeout()Lta8;

    .line 27
    .line 28
    .line 29
    iput-byte v2, v0, Lr13;->e:B

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string p0, "state: "

    .line 33
    .line 34
    iget-byte v0, v0, Lr13;->e:B

    .line 35
    .line 36
    invoke-static {v0, p0}, Lom0;->e(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public read(Li90;J)J
    .locals 2

    .line 1
    iget-object v0, p0, Ln13;->Z:Lr13;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, v0, Lr13;->c:Lba0;

    .line 7
    .line 8
    invoke-interface {v1, p1, p2, p3}, Lje7;->read(Li90;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-wide p0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    iget-object p2, v0, Lr13;->b:Lp76;

    .line 15
    .line 16
    invoke-virtual {p2}, Lp76;->k()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ln13;->g()V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public final timeout()Lta8;
    .locals 0

    .line 1
    iget-object p0, p0, Ln13;->X:Ldk2;

    .line 2
    .line 3
    return-object p0
.end method
