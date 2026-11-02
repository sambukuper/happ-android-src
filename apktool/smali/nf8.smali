.class public final Lnf8;
.super Lkf8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Ltl5;


# direct methods
.method public constructor <init>(Ltl5;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lkf8;-><init>(B)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lnf8;->g0:Ltl5;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lkf8;->f0:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iput v1, p0, Lkf8;->f0:I

    .line 6
    .line 7
    new-instance v1, Lc05;

    .line 8
    .line 9
    iget-object v2, p0, Lkf8;->Y:[Ljava/lang/Object;

    .line 10
    .line 11
    aget-object v3, v2, v0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    aget-object v0, v2, v0

    .line 16
    .line 17
    iget-object p0, p0, Lnf8;->g0:Ltl5;

    .line 18
    .line 19
    invoke-direct {v1, p0, v3, v0}, Lc05;-><init>(Ltl5;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method
