.class public final Lb79;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh1;
.implements Lp3;


# instance fields
.field public final a:Lps;


# direct methods
.method public constructor <init>(Lps;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb79;->a:Lps;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final h(Lc30;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb79;->a:Lps;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lps;->a(Lqj2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i()Lps;
    .locals 0

    .line 1
    iget-object p0, p0, Lb79;->a:Lps;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Lh1;
    .locals 2

    .line 1
    new-instance p0, Lb79;

    .line 2
    .line 3
    new-instance v0, Lps;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1}, Lps;-><init>(B)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Lb79;-><init>(Lps;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
