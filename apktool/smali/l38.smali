.class public final Ll38;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ls01;
.implements Las2;


# instance fields
.field public s0:Lrn2;

.field public final t0:Lrh5;


# direct methods
.method public constructor <init>(Lrn2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll38;->s0:Lrn2;

    .line 5
    .line 6
    sget-object p1, Llh4;->i0:Llh4;

    .line 7
    .line 8
    new-instance v0, Lrh5;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1, p1}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ll38;->t0:Lrh5;

    .line 15
    .line 16
    new-instance p1, Lsd;

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    invoke-direct {p1, p0, v0}, Lsd;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lyy7;->a:Laq5;

    .line 23
    .line 24
    new-instance v0, Lcz7;

    .line 25
    .line 26
    invoke-direct {v0, v1, v1, p1}, Lcz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final e0(Li55;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ll38;->t0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
