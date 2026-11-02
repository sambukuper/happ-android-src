.class public abstract Lnh8;
.super Lui8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Ls18;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls18;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Ls18;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lnh8;->b:Ls18;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final d(Lt14;)Lni8;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lt14;->n0()Llh8;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lnh8;->g(Llh8;)Lni8;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public abstract g(Llh8;)Lni8;
.end method
