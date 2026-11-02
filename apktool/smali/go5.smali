.class public final Lgo5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lnf5;


# instance fields
.field public X:Lyr4;

.field public final Y:Lvi4;

.field public final Z:Lw03;


# direct methods
.method public constructor <init>(Lyr4;Lvi4;Lw03;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgo5;->X:Lyr4;

    .line 5
    .line 6
    iput-object p2, p0, Lgo5;->Y:Lvi4;

    .line 7
    .line 8
    iput-object p3, p0, Lgo5;->Z:Lw03;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final t()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgo5;->Y:Lvi4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvi4;->m0()Ly24;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ly24;->g()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
