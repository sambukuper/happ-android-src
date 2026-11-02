.class public final Lb70;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw07;


# instance fields
.field public s0:Lx60;

.field public t0:F

.field public u0:Lfe7;

.field public v0:Lx67;

.field public final w0:Lic0;


# direct methods
.method public constructor <init>(FLfe7;Lx67;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lb70;->t0:F

    .line 5
    .line 6
    iput-object p2, p0, Lb70;->u0:Lfe7;

    .line 7
    .line 8
    iput-object p3, p0, Lb70;->v0:Lx67;

    .line 9
    .line 10
    new-instance p1, Ly0;

    .line 11
    .line 12
    const/16 p2, 0xd

    .line 13
    .line 14
    invoke-direct {p1, p0, p2}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lic0;

    .line 18
    .line 19
    new-instance p3, Ljc0;

    .line 20
    .line 21
    invoke-direct {p3}, Ljc0;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-direct {p2, p3, p1}, Lic0;-><init>(Ljc0;Lgn2;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lb70;->w0:Lic0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final h(Lf17;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb70;->v0:Lx67;

    .line 2
    .line 3
    invoke-static {p1, p0}, Ld17;->e(Lf17;Lx67;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
