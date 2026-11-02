.class public final Lip0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic a:Lip0;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lip0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lip0;->a:Lip0;

    .line 7
    .line 8
    const-wide/16 v4, 0x1

    .line 9
    .line 10
    const-wide/32 v6, 0x7ffffffe

    .line 11
    .line 12
    .line 13
    const-string v1, "kotlinx.coroutines.channels.defaultBuffer"

    .line 14
    .line 15
    const-wide/16 v2, 0x40

    .line 16
    .line 17
    invoke-static/range {v1 .. v7}, Ls08;->i(Ljava/lang/String;JJJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    long-to-int v0, v0

    .line 22
    sput v0, Lip0;->b:I

    .line 23
    .line 24
    return-void
.end method
