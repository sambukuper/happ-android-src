.class public final Le95;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lbx5;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbx5;

    .line 5
    .line 6
    sget-object v1, Ld95;->X:Ld95;

    .line 7
    .line 8
    invoke-virtual {v1}, Lnd0;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v0, v1, v2}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Le95;->a:Lbx5;

    .line 16
    .line 17
    return-void
.end method
