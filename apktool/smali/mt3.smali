.class public final Lmt3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfz3;


# instance fields
.field public final a:Lgz3;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lgz3;

    .line 5
    .line 6
    const-class v1, Lmt3;

    .line 7
    .line 8
    sget-object v2, Lyb6;->a:Lzb6;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Lgz3;-><init>(Lzu3;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lmt3;->a:Lgz3;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final c()Lgz3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmt3;->a:Lgz3;

    .line 2
    .line 3
    return-object p0
.end method
