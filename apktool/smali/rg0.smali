.class public final synthetic Lrg0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lrg0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrg0;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lrg0;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lrg0;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lrg0;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-byte v0, p0, Lrg0;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lrg0;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lrg0;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lrg0;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lrg0;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lb98;

    .line 15
    .line 16
    check-cast v3, Landroid/view/Surface;

    .line 17
    .line 18
    check-cast v2, Lud0;

    .line 19
    .line 20
    check-cast v1, Lhy7;

    .line 21
    .line 22
    const-string v0, "TextureViewImpl"

    .line 23
    .line 24
    invoke-static {v0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lb98;->l:Lmf1;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Lmf1;->c()V

    .line 33
    .line 34
    .line 35
    iput-object v4, p0, Lb98;->l:Lmf1;

    .line 36
    .line 37
    :cond_0
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lb98;->g:Lud0;

    .line 41
    .line 42
    if-ne v0, v2, :cond_1

    .line 43
    .line 44
    iput-object v4, p0, Lb98;->g:Lud0;

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Lb98;->h:Lhy7;

    .line 47
    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    iput-object v4, p0, Lb98;->h:Lhy7;

    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :pswitch_0
    check-cast p0, Landroidx/work/impl/WorkDatabase;

    .line 54
    .line 55
    check-cast v3, Ls39;

    .line 56
    .line 57
    check-cast v2, Ljava/util/List;

    .line 58
    .line 59
    check-cast v1, Lxy0;

    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v4, v3, Ls39;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v0, v0, Ln49;->a:Lql6;

    .line 74
    .line 75
    new-instance v5, Lnm7;

    .line 76
    .line 77
    const/16 v6, 0xd

    .line 78
    .line 79
    invoke-direct {v5, v4, v6}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 80
    .line 81
    .line 82
    const/4 v4, 0x1

    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-static {v0, v4, v6, v5}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_4

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Lxw6;

    .line 112
    .line 113
    iget-object v5, v3, Ls39;->a:Ljava/lang/String;

    .line 114
    .line 115
    invoke-interface {v4, v5}, Lxw6;->d(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    invoke-static {v1, p0, v2}, Lax6;->b(Lxy0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    :goto_1
    return-void

    .line 123
    :pswitch_1
    check-cast p0, Lol0;

    .line 124
    .line 125
    check-cast v3, Landroid/hardware/camera2/CameraCaptureSession;

    .line 126
    .line 127
    check-cast v2, Landroid/hardware/camera2/CaptureRequest;

    .line 128
    .line 129
    check-cast v1, Landroid/hardware/camera2/CaptureFailure;

    .line 130
    .line 131
    iget-object p0, p0, Lol0;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 132
    .line 133
    invoke-virtual {p0, v3, v2, v1}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_2
    check-cast p0, Lol0;

    .line 138
    .line 139
    check-cast v3, Landroid/hardware/camera2/CameraCaptureSession;

    .line 140
    .line 141
    check-cast v2, Landroid/hardware/camera2/CaptureRequest;

    .line 142
    .line 143
    check-cast v1, Landroid/hardware/camera2/TotalCaptureResult;

    .line 144
    .line 145
    iget-object p0, p0, Lol0;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 146
    .line 147
    invoke-virtual {p0, v3, v2, v1}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
