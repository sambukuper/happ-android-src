.class public final Ls57;
.super Lyj2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final f0:Ljava/lang/Object;

.field public final g0:Ld63;

.field public final h0:I

.field public final i0:I


# direct methods
.method public constructor <init>(Ln63;Landroid/util/Size;Ld63;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lyj2;-><init>(Ln63;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ls57;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lyj2;->Y:Ln63;

    .line 14
    .line 15
    invoke-interface {p1}, Ln63;->b()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Ls57;->h0:I

    .line 20
    .line 21
    iget-object p1, p0, Lyj2;->Y:Ln63;

    .line 22
    .line 23
    invoke-interface {p1}, Ln63;->a()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Ls57;->i0:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, p0, Ls57;->h0:I

    .line 35
    .line 36
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Ls57;->i0:I

    .line 41
    .line 42
    :goto_0
    iput-object p3, p0, Ls57;->g0:Ld63;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Ls57;->i0:I

    .line 2
    .line 3
    return p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, Ls57;->h0:I

    .line 2
    .line 3
    return p0
.end method

.method public final r0()Ld63;
    .locals 0

    .line 1
    iget-object p0, p0, Ls57;->g0:Ld63;

    .line 2
    .line 3
    return-object p0
.end method
