.class public final Lln;
.super Landroid/text/SegmentFinder;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lxd6;


# direct methods
.method public constructor <init>(Lxd6;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lln;->a:Lxd6;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/text/SegmentFinder;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final nextEndBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lln;->a:Lxd6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxd6;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final nextStartBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lln;->a:Lxd6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxd6;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final previousEndBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lln;->a:Lxd6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxd6;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final previousStartBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lln;->a:Lxd6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxd6;->e(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
